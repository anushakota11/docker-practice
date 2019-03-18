package com.docker.example.dockerspringbootexample.rest;

import java.net.InetAddress;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("docker/host")
public class HostInfo {
	
	@GetMapping
	public String hostNameAndTime() {
		String hostName="";
		try {
			InetAddress ip = InetAddress.getLocalHost();
			hostName = ip.getHostName();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return hostName;
	}

}
