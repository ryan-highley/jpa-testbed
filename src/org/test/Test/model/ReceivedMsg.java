package org.test.Test.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the RECEIVED_MSG database table.
 * 
 */
@Entity
@Table(name="RECEIVED_MSG")
@NamedQuery(name="ReceivedMsg.findAll", query="SELECT r FROM ReceivedMsg r")
public class ReceivedMsg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"body\"")
	private String body;

	@Column(name="CORRELATION_ID")
	private String correlationId;

	@Id
	private BigDecimal id;

	@Column(name="MESSAGE_ID")
	private String messageId;

	@Column(name="\"timestamp\"")
	private BigDecimal timestamp;

	public ReceivedMsg() {
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getCorrelationId() {
		return this.correlationId;
	}

	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getMessageId() {
		return this.messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public BigDecimal getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(BigDecimal timestamp) {
		this.timestamp = timestamp;
	}

}