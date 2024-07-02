DROP TABLE IF EXISTS TRADE;
CREATE TABLE TRADE (
                       tradeId INT AUTO_INCREMENT  PRIMARY KEY,
                       version VARCHAR(10) NOT NULL,
                       counterPartyId VARCHAR(20) NOT NULL,
                       bookId VARCHAR(10) NOT NULL,
                       createDate DATE  NOT NULL,
                       maturityDate DATE NOT NULL
);