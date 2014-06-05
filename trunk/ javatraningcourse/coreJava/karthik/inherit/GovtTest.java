package inherit;

public class GovtTest {
public static void main(String[] args) {
	
	RepublicGovt rgv= new RepublicGovt();
	rgv.noofcabinet=56;
	rgv.noofsenetors=56;
	rgv.presidentname="obama";
	rgv.attendparliament();
	DemocraticGovt dgv= new DemocraticGovt();
	dgv.attendparliament();
	
	
	
}
}
