package com.devsuperior.dslist.projections;

//necessário por usar a assinatura @Query
public interface GameMinProjection {

	Long getId();
	String getTitle();
	Integer getGameYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
}