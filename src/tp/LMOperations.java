package tp;


/**
* tp/LMOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from LM.idl
* mardi 17 mai 2016 11 h 07 CEST
*/

public interface LMOperations 
{
  String theme ();
  String moderator ();
  boolean postMessage (tp.Message m);
  tp.Message getMessage (String title);
  boolean removeMessage (String title);
} // interface LMOperations