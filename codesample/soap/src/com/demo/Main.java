package com.demo;

import javax.xml.ws.Endpoint;

public class Main {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/calapp", new Calculator());
	}
}
