package projeto;
import java.util.Random;
public class Sinistro {
	private int id;
	private String data;
	private String endereco;
	
	public Sinistro(int id, String data, String endereco) {
		super();
		this.id = id;
		this.data = data;
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
        public static int gerarID() {
            Random random = new Random();
            int id = random.nextInt(100000) + 1;
            return id;
        }
}