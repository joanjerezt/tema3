package de.vogella.mysql.dao;

import java.util.List;

public interface PiecesDao {
   public List<Pieces> getAllPieces();
   public Pieces getPiece(int Code);
   public void updatePiece(Pieces piece);
   public void deletePiece(Pieces piece);
}
