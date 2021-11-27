package Projektet;

import javax.swing.JOptionPane;

public class paga {
    public static void main(String[] args) {
        String emri;
        double ore_shtese, paga_bruto_punonjesit, paga_neto_punonjesit;
        int oret_e_punes;

        emri = JOptionPane.showInputDialog(null, "Emri juaj eshte? ", "Emri", JOptionPane.INFORMATION_MESSAGE);

        oret_e_punes = (int) Double.parseDouble(JOptionPane.showInputDialog(null,
                "Pershendetje " + emri + "\nJepni sa ore keni punuar :", "Oret", JOptionPane.INFORMATION_MESSAGE));
        JOptionPane.showMessageDialog(null,
                "Shtypni OK ne qoftese oret jane te sakta    " + "\n" + "\n" + "        Emri juaj eshte " + emri
                        + " dhe" + "\n" + "      ju keni punuar " + oret_e_punes + " ore shtes",
                "Confirmation Dialog", JOptionPane.INFORMATION_MESSAGE);

        if (oret_e_punes >= 200) {
            if (oret_e_punes == 200) {
                paga_bruto_punonjesit = oret_e_punes * 3.5;
                paga_neto_punonjesit = paga_bruto_punonjesit * 0.87;
                paga_200(oret_e_punes, paga_bruto_punonjesit, paga_neto_punonjesit);

            } else if (oret_e_punes > 200) {
                ore_shtese = oret_e_punes - 200;
                double oretextra = ore_shtese * 5;
                double pagabruto = 200 * 3.5;
                paga_bruto_punonjesit = pagabruto + oretextra;
                paga_neto_punonjesit = paga_bruto_punonjesit * 0.87;
                paga_me_shume_se_200(oret_e_punes, paga_bruto_punonjesit, paga_neto_punonjesit);
            }

        } else if (oret_e_punes < 200) {
            paga_bruto_punonjesit = oret_e_punes * 3.5;
            paga_neto_punonjesit = paga_bruto_punonjesit * 0.87;
            paga_me_pak_se_200(oret_e_punes, paga_bruto_punonjesit, paga_neto_punonjesit);
        }

    }

    public static void paga_200(double oret_e_punes, double paga_bruto_punonjesit, double paga_neto_punonjesit) {

        JOptionPane.showMessageDialog(null, "Paga juaj bruto eshte " + paga_bruto_punonjesit + " leke", null,
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Paga juaj neto eshte " + paga_neto_punonjesit + " leke", null,
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void paga_me_shume_se_200(double oret_e_punes, double paga_bruto_punonjesit,
            double paga_neto_punonjesit) {

        JOptionPane.showMessageDialog(null, "Paga juaj bruto eshte " + paga_bruto_punonjesit + " leke", null,
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Paga juaj neto eshte " + paga_neto_punonjesit + " leke", null,
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void paga_me_pak_se_200(double oret_e_punes, double paga_bruto_punonjesit,
            double paga_neto_punonjesit) {

        JOptionPane.showMessageDialog(null, "Paga juaj bruto eshte " + paga_bruto_punonjesit + " leke", null,
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Paga juaj neto eshte " + paga_neto_punonjesit + " leke", null,
                JOptionPane.INFORMATION_MESSAGE);

    }
}