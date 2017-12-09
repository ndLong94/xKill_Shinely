/*
 *-------------------------------------------------------------------
 * Copyright (c)2017 Jeppesen
 * All Rights Reserved.
 * THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE.
 * -------------------------------------------------------------------
*/

package com.market.demo.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Encoder {

	private Encoder() {
	}
	
	public static String encodePassword(String basePassword) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(basePassword.getBytes());
        return Base64.getEncoder().encodeToString(md.digest());
	}
	
	public static String encodeFile(byte [] byteFile) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(byteFile);
        BigInteger bigInteger = new BigInteger(1,md.digest());
        return bigInteger.toString(16);
	}
	
}
