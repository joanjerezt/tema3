package de.vogella.mysql.dao;

public class DaoPatternDemo {
	   public static void main(String[] args) {
	      PiecesDao pieceDao = new PiecesDaoImpl();

	      /*print all students */
	      for (Pieces piece: pieceDao.getAllPieces()) {
	         System.out.println("Piece: [Code : " + piece.getCode() + ", Name : " + piece.getName() + " ]");
	      }

	      //update student
	      Pieces piece = pieceDao.getAllPieces().get(0);
	      piece.setName("Computer");
	      pieceDao.updatePiece(piece);

	      //get the student
	      pieceDao.getPiece(0);
	      System.out.println("Piece: [Code : " + piece.getCode() + ", Name : " + piece.getName() + " ]");		
	   }
	}
