package com.market.demo.dto;

import java.io.Serializable;

/**
 * Created by HuyTQ18 on 6/17/2016.
 *
 * @author HuyTQ18
 */
public class ErrorDTO implements Serializable {
    private String code;
    private String message;
    private String url;

    /**
     * Instantiates a new Error dto.
     */
    public ErrorDTO() {
    }

    /**
     * Instantiates a new Error dto.
     *
     * @param code
     *            the code
     * @param message
     *            the message
     * @param url
     *            the url
     */
    public ErrorDTO(String code, String message, String url) {
        this.code = code;
        this.message = message;
        this.url = url;
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets code.
     *
     * @param code
     *            the code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     *
     * @param message
     *            the message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets url.
     *
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets url.
     *
     * @param url
     *            the url
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
