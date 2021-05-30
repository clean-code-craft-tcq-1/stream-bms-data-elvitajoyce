package sender;

/**
 * Hello world!
 *
 */
public class SenderApp 
{
    public static void main( String[] args )
    {
      ISenderData streamData = new SenderDataImpl();
      streamData.getBMSData(15);
    }
}
