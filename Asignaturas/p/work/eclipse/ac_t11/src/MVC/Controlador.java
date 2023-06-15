import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener{
	
	Model model;
	Vista vista;
	
	public Controlador(Model model, Vista vista) {
		super();
		this.model = model;
		this.vista = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		model.edad = Integer.parseInt(vista.getTextFieldEdad().getText());
		if (e.getActionCommand().equals("ADDYEARS")){
			model.addYears();
			vista.getTextFieldEdad().setText(String.valueOf(model.edad));
			vista.getLblResult().setText(vista.getTextFieldNombre().getText()+ " has "+ String.valueOf(model.edad)+ " years.");
		}
		if (e.getActionCommand().equals("SUBYEARS")){
			model.subYears();
			vista.getTextFieldEdad().setText(String.valueOf(model.edad));
			vista.getLblResult().setText(vista.getTextFieldNombre().getText()+ " has "+ String.valueOf(model.edad)+ " years.");
		}	
	}
}
