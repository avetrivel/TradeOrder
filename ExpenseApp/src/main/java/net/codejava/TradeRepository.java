package net.codejava;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface TradeRepository extends CrudRepository<Trade, Long> {

	public List<Trade> findByTradeId(Long tradeId) ;
	public List<Trade> findByCounterPartyId(String item);
	
	@Query("SELECT e FROM Trade e WHERE e.bookId = :bookId")
	public List<Trade> listItemsWithPriceOver(@Param("bookId") String bookId);
}
