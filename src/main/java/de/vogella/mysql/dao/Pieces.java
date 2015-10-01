package de.vogella.mysql.dao;

public class Pieces {
	   private String Name;
	   private int Code;

	   Pieces(String Name, int Code){
	      this.Name = Name;
	      this.Code = Code;
	   }

	   public String getName() {
	      return Name;
	   }

	   public void setName(String Name) {
	      this.Name = Name;
	   }

	   public int getCode() {
	      return Code;
	   }

	   public void setCode(int Code) {
	      this.Code = Code;
	   }

	}
