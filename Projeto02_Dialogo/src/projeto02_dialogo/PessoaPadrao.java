package projeto02_dialogo;

/**
 *
 * @author 081170044
 */
public class PessoaPadrao

{
    protected String nomePessoa;
    protected String dialogo1;
    protected String dialogo2;

    /**
     * @return the nomePessoa
     */
    public String getNomePessoa() {
        return nomePessoa;
    }

    /**
     * @param nomePessoa the nomePessoa to set
     */
    public void setNomePessoa(String nomePessoa) {
        if (nomePessoa.length() > 0)          
            this.nomePessoa = nomePessoa;
    }

    /**
     * @return the dialogo1
     */
    public String getDialogo1() {
        return dialogo1;
    }

    /**
     * @param dialogo1 the dialogo1 to set
     */
    public void setDialogo1(String dialogo1) {
        if (dialogo1.length() > 0)
            this.dialogo1 = dialogo1;
    }

    /**
     * @return the dialogo2
     */
    public String getDialogo2() {
        return dialogo2;
    }

    /**
     * @param dialogo2 the dialogo2 to set
     */
    public void setDialogo2(String dialogo2) {
        if (dialogo2.length() > 0)
            this.dialogo2 = dialogo2;
    } 
}
