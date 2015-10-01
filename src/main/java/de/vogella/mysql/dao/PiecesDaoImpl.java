package de.vogella.mysql.dao;

import java.util.ArrayList;
import java.util.List;

public class PiecesDaoImpl implements PiecesDao {
	
   //list is working as a database
   List<Pieces> pieces;

   public PiecesDaoImpl(){
      pieces = new ArrayList<Pieces>();
      Pieces piece1 = new Pieces("DVD drive",0);
      Pieces piece2 = new Pieces("Car",1);
      pieces.add(piece1);
      pieces.add(piece2);		
   }
   public void deletePiece(Pieces piece) {
      pieces.remove(piece.getCode());
      System.out.println("Piece: Code " + piece.getCode() + ", deleted from database");
   }
   
   //retrive list of Piecess from the database
   public List<Pieces> getAllPieces() {
      return pieces;
   }
   public Pieces getPiece(int Code) {
      return pieces.get(Code);
   }
   public void updatePiece(Pieces piece) {
      pieces.get(piece.getCode()).setName(piece.getName());
      System.out.println("Piece: Code " + piece.getCode() + ", updated in the database");
   }
}
