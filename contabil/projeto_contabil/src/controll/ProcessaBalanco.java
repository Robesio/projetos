package controll;

import javax.swing.JOptionPane;

import model.dao.BalancoDAO;

public class ProcessaBalanco {

	private static BalancoDAO rd = new BalancoDAO();

	public static void setRd(String dados, String arquivo) {
		if (rd.saveReport(dados, arquivo)) { //Pega do m�todo 'saveReport' na classe 'Bala�oDAO'
			JOptionPane.showMessageDialog(null, "Relat�rio salvo com sucesso");
		} else {
			JOptionPane.showMessageDialog(null, "Erro ao salvar Relat�rio");
		}
	}
}
