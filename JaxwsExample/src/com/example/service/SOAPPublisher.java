package com.example.service;

import javax.xml.ws.Endpoint;

public class SOAPPublisher {

	public static void main(String[] args) {
        Endpoint.publish("http://localhost:8888/ws/student", new StudentServiceImpl());  
   }
}
