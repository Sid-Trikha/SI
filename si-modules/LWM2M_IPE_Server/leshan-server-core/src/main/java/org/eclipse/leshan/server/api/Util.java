package org.eclipse.leshan.server.api;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.annotation.Resource;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.eclipse.leshan.LinkObject;
import sun.misc.BASE64Encoder;
import sun.misc.BASE64Decoder;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class Util {
	
	
	/***********************************************
	*		 common
	************************************************/
	
	// null 이나 empty이면 true 반환
	public static boolean isNoE(String msg){
		boolean result = false;
		if(msg==null || msg.equals("")){
			result = true;
		}
		return result;
	}
	
	// null 이나 empty이면 true 반환
	public static boolean isNoEOprAnd(String ... msgs){
		boolean result = false;
		int count = 0;
		for(String msg : msgs){
			if(msg==null || msg.equals("")){
				count += 1;
			}
		}
		if(count == msgs.length){
			result = true;
		}
		return result;
	}
	
	// null 이나 empty이면 true 반환
	public static boolean isNoEOprOr(String ... msgs){
		boolean result = false;
		for(String msg : msgs){
			if(msg==null || msg.equals("")){
				result = true;
				break;
			}
		}
		return result;
	}
	
	// url 만들기 "/"로 구분
	public static String makeUrl(String ...paths){
		StringBuffer sb = new StringBuffer(paths[0]);
		for(int i=1; i<paths.length; i++){
			sb.append("/").append(paths[i]);
		}
		return sb.toString();
	}
	
	// 글자 조합하기
	public static String combineString(String... str){
        StringBuffer sb = new StringBuffer();
        for( int i=0; i<str.length; i++ ) {
            sb.append(str[i]);
        }
        return sb.toString();
    }
	
	/***********************************************
	*		 oneM2M
	************************************************/
	
	
	// pcu 결과 xml에서 con값 가져오기
	public static String getValue( String xml, String path ) {
        Node node = null;
        String make_xml = combineString(xml.substring(0,xml.indexOf(">")+1),"<root>",xml.substring(xml.indexOf(">")+1),"</root>");
        try {
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(make_xml.getBytes()));
            doc.getDocumentElement().normalize();
            XPath xpath = XPathFactory.newInstance().newXPath();
            String pathResult = "";
            if( path.equals("sur") ){
            	pathResult = "//pc/sgn/sur";
            } else {
            	pathResult = "//pc/sgn/nev/rep/cin/"+path;
            }
            node = (Node) xpath.evaluate(pathResult, doc, XPathConstants.NODE);
        } catch( Exception e ) {
            e.printStackTrace();
        }
        return node.getTextContent();
    }
	
	
	
	// byte[] 를 hex code로 : psk
	public static String byteArrayToHex(byte[] a) {
        StringBuilder sb = new StringBuilder();
        for(final byte b: a)
            sb.append(String.format("%02x", b&0xff));
        return sb.toString();
    }    
	
	// device id 추출
	public static int[] getObjectId(LinkObject[] lo){
		int[] result = new int[lo.length-1];
		for (int i = 0; i < lo.length-1; i++) {
			String value = lo[i+1].toString().substring(2,3);
			result[i] = Integer.parseInt(value);
		}
		return result;
	}
	
	// device id 추출
	public static String[] getUri(LinkObject[] lo){
		String[] result = new String[lo.length-1];
		for (int i = 0; i < lo.length-1; i++) {
			result[i] = lo[i+1].toString().replace("<", "").replace(">", "");
		}
		return result;
	}
	
	
	public static String doEncDec(JSONObject j, String operation){
        String result = null;
        
        BASE64Encoder encoder = new BASE64Encoder();
        BASE64Decoder decoder = new BASE64Decoder();
        
        if( "encode".equals(operation) ){
            result = encoder.encode(j.toString().replace("\\","").getBytes());
        } else if( "decode".equals(operation) ){
            try {
				result = new String(decoder.decodeBuffer(j.toString()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        return new String(result);
    }

}
