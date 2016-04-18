package com.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jacob.c
 * @since 2016. 4. 18.
 */
@RestController
public class SampleController {

	@RequestMapping("/status")
	public String status() {
		return "OK";
	}

}
