package test;
public class GenerateBranch {
	public String generate(String brCode)
	{
		return switch(brCode)
				{
				case "01":yield "CIVIL";
				case "02":yield "EEE";
				case "03":yield "MECH";
				case "04":yield "ECE";
				case "05":yield "CSE";
				default :yield null;
				};
	}
}
