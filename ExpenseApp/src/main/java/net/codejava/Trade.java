package net.codejava;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Trade")
public class Trade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long tradeId;
	private String version;
	private String counterPartyId;
	private String bookId;
	private Date createDate;
	private Date maturityDate;

	public Date getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getCounterPartyId() {
		return counterPartyId;
	}

	public void setCounterPartyId(String counterPartyId) {
		this.counterPartyId = counterPartyId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	
	protected Trade() {
	}

	public Trade(Long tradeId, String version, String counterPartyId, String bookId, Date createDate, Date maturityDate) {
		this.tradeId = tradeId;
		this.version = version;
		this.counterPartyId = counterPartyId;
		this.bookId = bookId;
		this.createDate = createDate;
		this.maturityDate = maturityDate;
	}

	public Long getTradeId() {
		return tradeId;
	}

	public void setTradeId(Long tradeId) {
		this.tradeId = tradeId;
	}



	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	@Override
	public String toString() {
		return tradeId + ". " + version + " . " + counterPartyId + " ,"+ createDate;
	}
}
