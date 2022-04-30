public class Principal {
    public static void main(String[] args) {
        // Criando Cinema
        Cinema meuCinema = new Cinema("Cine POO");

        // Criando Salas
        Sala salaVip1 = new SalaGrande("Sala VIP 1");
        Sala salaVip2 = new SalaGrande("Sala VIP 2");
        Sala salaVip3 = new SalaGrande("Sala VIP 3");

        Sala salaA = new SalaMedia("Sala A");
        Sala salaB = new SalaMedia("Sala B");
        Sala salaC = new SalaMedia("Sala C");
        Sala salaD = new SalaMedia("Sala D");

        Sala salaE = new SalaPequena("Sala E");
        Sala salaF = new SalaPequena("Sala F");
        Sala salaG = new SalaPequena("Sala G");
        Sala salaH = new SalaPequena("Sala H");
        Sala salaI = new SalaPequena("Sala I");

        // Cadastrando Salas no Cinema
        meuCinema.cadastrarSala(salaVip1);
        meuCinema.cadastrarSala(salaVip2);
        meuCinema.cadastrarSala(salaVip3);
        meuCinema.cadastrarSala(salaA);
        meuCinema.cadastrarSala(salaB);
        meuCinema.cadastrarSala(salaC);
        meuCinema.cadastrarSala(salaD);
        meuCinema.cadastrarSala(salaE);
        meuCinema.cadastrarSala(salaF);
        meuCinema.cadastrarSala(salaG);
        meuCinema.cadastrarSala(salaH);
        meuCinema.cadastrarSala(salaI);

        System.out.println("------------------");

        // Obtendo preços das 3 categorias de Salas

        // Manhã
        System.out.println("Sessão do " + meuCinema.getNome());
        System.out.println(meuCinema.getSessao());

        System.out.println("Sala Grande: " + meuCinema.getSalas().get("Sala VIP 1").getPrecoBilhete());
        System.out.println("Sala Média: " + meuCinema.getSalas().get("Sala A").getPrecoBilhete());
        System.out.println("Sala Pequena: " + meuCinema.getSalas().get("Sala E").getPrecoBilhete());

        System.out.println("------------------");

        // Tarde
        meuCinema.setSessao(Sessao.VESPERTINA);
        System.out.println("Sessão do " + meuCinema.getNome());
        System.out.println(meuCinema.getSessao());

        System.out.println("Sala Grande: " + meuCinema.getSalas().get("Sala VIP 1").getPrecoBilhete());
        System.out.println("Sala Média: " + meuCinema.getSalas().get("Sala A").getPrecoBilhete());
        System.out.println("Sala Pequena: " + meuCinema.getSalas().get("Sala E").getPrecoBilhete());

        System.out.println("------------------");

        //Noite
        meuCinema.setSessao(Sessao.NOTURNA);
        System.out.println("Sessão do " + meuCinema.getNome());
        System.out.println(meuCinema.getSessao());

        System.out.println("Sala Grande: " + meuCinema.getSalas().get("Sala VIP 1").getPrecoBilhete());
        System.out.println("Sala Média: " + meuCinema.getSalas().get("Sala A").getPrecoBilhete());
        System.out.println("Sala Pequena: " + meuCinema.getSalas().get("Sala E").getPrecoBilhete());

        System.out.println("------------------");

        // Obtendo lucro do cinema

        meuCinema.reservarSala("Sala VIP 1");

        System.out.println(meuCinema.obterLucro());
    }
}
