package com.github.ishiningway.bullshit.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author ishiningway
 */
public class Data{

	@JsonProperty("famous")
	private List<String> famous;

	@JsonProperty("before")
	private List<String> before;

	@JsonProperty("after")
	private List<String> after;

	@JsonProperty("title")
	private String title;

	@JsonProperty("bosh")
	private List<String> bosh;

	public void setFamous(List<String> famous){
		this.famous = famous;
	}

	public List<String> getFamous(){
		return famous;
	}

	public void setBefore(List<String> before){
		this.before = before;
	}

	public List<String> getBefore(){
		return before;
	}

	public void setAfter(List<String> after){
		this.after = after;
	}

	public List<String> getAfter(){
		return after;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setBosh(List<String> bosh){
		this.bosh = bosh;
	}

	public List<String> getBosh(){
		return bosh;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"famous = '" + famous + '\'' + 
			",before = '" + before + '\'' + 
			",after = '" + after + '\'' + 
			",title = '" + title + '\'' + 
			",bosh = '" + bosh + '\'' + 
			"}";
		}
}