import ij.IJ;
import ij.plugin.PlugIn;

public class Changed_Method_Signature implements PlugIn {
	@Override
	public void run(String arg) {
		ij.ImageJ.main(1.23);
	}
}
