package tp;


/**
* tp/Message.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from LM.idl
* mardi 17 mai 2016 11 h 07 CEST
*/

public final class Message implements org.omg.CORBA.portable.IDLEntity
{
  public String title = null;
  public String author = null;
  public String date = null;
  public String body = null;

  public Message ()
  {
  } // ctor

  public Message (String _title, String _author, String _date, String _body)
  {
    title = _title;
    author = _author;
    date = _date;
    body = _body;
  } // ctor

} // class Message