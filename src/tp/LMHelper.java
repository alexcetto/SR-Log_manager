package tp;


/**
* tp/LMHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from LM.idl
* mardi 17 mai 2016 11 h 07 CEST
*/

abstract public class LMHelper
{
  private static String  _id = "IDL:tp/LM:1.0";

  public static void insert (org.omg.CORBA.Any a, tp.LM that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static tp.LM extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (tp.LMHelper.id (), "LM");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static tp.LM read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_LMStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, tp.LM value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static tp.LM narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof tp.LM)
      return (tp.LM)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      tp._LMStub stub = new tp._LMStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static tp.LM unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof tp.LM)
      return (tp.LM)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      tp._LMStub stub = new tp._LMStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}