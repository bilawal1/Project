package Template_Method;

public abstract class DataParser {

	public void parseDataAndGenerateOutput()
	{
		readData();
		processData();
		writeData();
		
	}
	
	abstract void readData();
    abstract void processData();


    public  void writeData(){
        System.out.println("Output generated, writing to CSV");

    }
}
