package com.github.giovannalyssa99.ufg.poo.t18;

public class Main {
    public static void main(String[] args) {
        Partida partida = new Partida("Partida Imortal");

        Jogador jogador1 = new Jogador("Adolf Anderssen");
        Jogador jogador2 = new Jogador("Lionel Kieseritzky");

        Lance lance1 = new Lance();
        lance1.setNumero("1. ");
        lance1.setJogador(jogador1);
        lance1.setPeca("Peão");
        lance1.setPosicaoOrigem("e", "2");
        lance1.setPosicaoDestino("e", "4");
        partida.lances.add(lance1);

        Lance lance2 = new Lance();
        lance2.setNumero("2. ");
        lance2.setJogador(jogador2);
        lance2.setPeca("Peão");
        lance2.setPosicaoOrigem("e", "7");
        lance2.setPosicaoDestino("e", "5");
        partida.lances.add(lance2);

        Lance lance3 = new Lance();
        lance3.setNumero("3. ");
        lance3.setJogador(jogador1);
        lance3.setPeca("Peão");
        lance3.setPosicaoOrigem("f", "2");
        lance3.setPosicaoDestino("f", "4");
        partida.lances.add(lance3);

        Lance lance4 = new Lance();
        lance4.setNumero("4. ");
        lance4.setJogador(jogador2);
        lance4.setPeca("Peão");
        lance4.setPosicaoOrigem("e", "5");
        lance4.setPosicaoDestino("f", "4");
        partida.lances.add(lance4);

        Lance lance5 = new Lance();
        lance5.setNumero("5. ");
        lance5.setJogador(jogador1);
        lance5.setPeca("Bispo");
        lance5.setPosicaoOrigem("f", "1");
        lance5.setPosicaoDestino("c", "4");
        partida.lances.add(lance5);

        Lance lance6 = new Lance();
        lance6.setNumero("6. ");
        lance6.setJogador(jogador2);
        lance6.setPeca("Rainha");
        lance6.setPosicaoOrigem("d", "8");
        lance6.setPosicaoDestino("h", "4");
        partida.lances.add(lance6);

        Lance lance7 = new Lance();
        lance7.setNumero("7. ");
        lance7.setJogador(jogador1);
        lance7.setPeca("Rei");
        lance7.setPosicaoOrigem("e", "1");
        lance7.setPosicaoDestino("f", "1");
        partida.lances.add(lance7);

        Lance lance8 = new Lance();
        lance8.setNumero("8. ");
        lance8.setJogador(jogador2);
        lance8.setPeca("Peão");
        lance8.setPosicaoOrigem("b", "7");
        lance8.setPosicaoDestino("b", "5");
        partida.lances.add(lance8);

        Lance lance9 = new Lance();
        lance9.setNumero("9. ");
        lance9.setJogador(jogador1);
        lance9.setPeca("Bispo");
        lance9.setPosicaoOrigem("c", "4");
        lance9.setPosicaoDestino("b", "5");
        partida.lances.add(lance9);

        Lance lance10 = new Lance();
        lance10.setNumero("10. ");
        lance10.setJogador(jogador2);
        lance10.setPeca("Cavalo");
        lance10.setPosicaoOrigem("g", "8");
        lance10.setPosicaoDestino("f", "6");
        partida.lances.add(lance10);

        Lance lance11 = new Lance();
        lance11.setNumero("11. ");
        lance11.setJogador(jogador1);
        lance11.setPeca("Cavalo");
        lance11.setPosicaoOrigem("g", "1");
        lance11.setPosicaoDestino("f", "3");
        partida.lances.add(lance11);

        Lance lance12 = new Lance();
        lance12.setNumero("12. ");
        lance12.setJogador(jogador2);
        lance12.setPeca("Rainha");
        lance12.setPosicaoOrigem("h", "4");
        lance12.setPosicaoDestino("h", "6");
        partida.lances.add(lance12);

        Lance lance13 = new Lance();
        lance13.setNumero("13. ");
        lance13.setJogador(jogador1);
        lance13.setPeca("Peão");
        lance13.setPosicaoOrigem("d", "2");
        lance13.setPosicaoDestino("d", "3");
        partida.lances.add(lance13);

        Lance lance14 = new Lance();
        lance14.setNumero("14. ");
        lance14.setJogador(jogador2);
        lance14.setPeca("Cavalo");
        lance14.setPosicaoOrigem("f", "6");
        lance14.setPosicaoDestino("h", "5");
        partida.lances.add(lance14);

        Lance lance15 = new Lance();
        lance15.setNumero("15. ");
        lance15.setJogador(jogador1);
        lance15.setPeca("Cavalo");
        lance15.setPosicaoOrigem("f", "3");
        lance15.setPosicaoDestino("h", "4");
        partida.lances.add(lance15);

        Lance lance16 = new Lance();
        lance16.setNumero("16. ");
        lance16.setJogador(jogador2);
        lance16.setPeca("Rainha");
        lance16.setPosicaoOrigem("h", "6");
        lance16.setPosicaoDestino("g", "5");
        partida.lances.add(lance16);

        Lance lance17 = new Lance();
        lance17.setNumero("17. ");
        lance17.setJogador(jogador1);
        lance17.setPeca("Cavalo");
        lance17.setPosicaoOrigem("h", "4");
        lance17.setPosicaoDestino("f", "5");
        partida.lances.add(lance17);

        Lance lance18 = new Lance();
        lance18.setNumero("18. ");
        lance18.setJogador(jogador2);
        lance18.setPeca("Peão");
        lance18.setPosicaoOrigem("c", "7");
        lance18.setPosicaoDestino("c", "6");
        partida.lances.add(lance18);

        Lance lance19 = new Lance();
        lance19.setNumero("19. ");
        lance19.setJogador(jogador1);
        lance19.setPeca("Peão");
        lance19.setPosicaoOrigem("g", "2");
        lance19.setPosicaoDestino("g", "4");
        partida.lances.add(lance19);

        Lance lance20 = new Lance();
        lance20.setNumero("20. ");
        lance20.setJogador(jogador2);
        lance20.setPeca("Cavalo");
        lance20.setPosicaoOrigem("h", "5");
        lance20.setPosicaoDestino("f", "6");
        partida.lances.add(lance20);

        Lance lance21 = new Lance();
        lance21.setNumero("21. ");
        lance21.setJogador(jogador1);
        lance21.setPeca("Torre");
        lance21.setPosicaoOrigem("h", "1");
        lance21.setPosicaoDestino("g", "1");
        partida.lances.add(lance21);

        Lance lance22 = new Lance();
        lance22.setNumero("22. ");
        lance22.setJogador(jogador2);
        lance22.setPeca("Peão");
        lance22.setPosicaoOrigem("c", "6");
        lance22.setPosicaoDestino("b", "5");
        partida.lances.add(lance22);

        Lance lance23 = new Lance();
        lance23.setNumero("23. ");
        lance23.setJogador(jogador1);
        lance23.setPeca("Peão");
        lance23.setPosicaoOrigem("h", "2");
        lance23.setPosicaoDestino("h", "4");
        partida.lances.add(lance23);

        Lance lance24 = new Lance();
        lance24.setNumero("24. ");
        lance24.setJogador(jogador2);
        lance24.setPeca("Rainha");
        lance24.setPosicaoOrigem("g", "5");
        lance24.setPosicaoDestino("g", "6");
        partida.lances.add(lance24);

        Lance lance25 = new Lance();
        lance25.setNumero("25. ");
        lance25.setJogador(jogador1);
        lance25.setPeca("Peão");
        lance25.setPosicaoOrigem("h", "4");
        lance25.setPosicaoDestino("h", "5");
        partida.lances.add(lance25);

        Lance lance26 = new Lance();
        lance26.setNumero("26. ");
        lance26.setJogador(jogador2);
        lance26.setPeca("Rainha");
        lance26.setPosicaoOrigem("g", "6");
        lance26.setPosicaoDestino("g", "5");
        partida.lances.add(lance26);

        Lance lance27 = new Lance();
        lance27.setNumero("27. ");
        lance27.setJogador(jogador1);
        lance27.setPeca("Rainha");
        lance27.setPosicaoOrigem("d", "1");
        lance27.setPosicaoDestino("f", "3");
        partida.lances.add(lance27);

        Lance lance28 = new Lance();
        lance28.setNumero("28. ");
        lance28.setJogador(jogador2);
        lance28.setPeca("Cavalo");
        lance28.setPosicaoOrigem("f", "6");
        lance28.setPosicaoDestino("g", "8");
        partida.lances.add(lance28);

        Lance lance29 = new Lance();
        lance29.setNumero("29. ");
        lance29.setJogador(jogador1);
        lance29.setPeca("Bispo");
        lance29.setPosicaoOrigem("c", "1");
        lance29.setPosicaoDestino("f", "4");
        partida.lances.add(lance29);

        Lance lance30 = new Lance();
        lance30.setNumero("30. ");
        lance30.setJogador(jogador2);
        lance30.setPeca("Rainha");
        lance30.setPosicaoOrigem("g", "5");
        lance30.setPosicaoDestino("f", "6");
        partida.lances.add(lance30);

        Lance lance31 = new Lance();
        lance31.setNumero("31. ");
        lance31.setJogador(jogador1);
        lance31.setPeca("Cavalo");
        lance31.setPosicaoOrigem("b", "1");
        lance31.setPosicaoDestino("c", "3");
        partida.lances.add(lance31);

        Lance lance32 = new Lance();
        lance32.setNumero("32. ");
        lance32.setJogador(jogador2);
        lance32.setPeca("Bispo");
        lance32.setPosicaoOrigem("f", "8");
        lance32.setPosicaoDestino("c", "5");
        partida.lances.add(lance32);

        Lance lance33 = new Lance();
        lance33.setNumero("33. ");
        lance33.setJogador(jogador1);
        lance33.setPeca("Cavalo");
        lance33.setPosicaoOrigem("c", "3");
        lance33.setPosicaoDestino("d", "5");
        partida.lances.add(lance33);

        Lance lance34 = new Lance();
        lance34.setNumero("34. ");
        lance34.setJogador(jogador2);
        lance34.setPeca("Rainha");
        lance34.setPosicaoOrigem("f", "6");
        lance34.setPosicaoDestino("b", "2");
        partida.lances.add(lance34);

        Lance lance35 = new Lance();
        lance35.setNumero("35. ");
        lance35.setJogador(jogador1);
        lance35.setPeca("Bispo");
        lance35.setPosicaoOrigem("f", "4");
        lance35.setPosicaoDestino("d", "6");
        partida.lances.add(lance35);

        Lance lance36 = new Lance();
        lance36.setNumero("36. ");
        lance36.setJogador(jogador2);
        lance36.setPeca("Bispo");
        lance36.setPosicaoOrigem("c", "5");
        lance36.setPosicaoDestino("g", "1");
        partida.lances.add(lance36);

        Lance lance37 = new Lance();
        lance37.setNumero("37. ");
        lance37.setJogador(jogador1);
        lance37.setPeca("Peão");
        lance37.setPosicaoOrigem("e", "4");
        lance37.setPosicaoDestino("e", "5");
        partida.lances.add(lance37);

        Lance lance38 = new Lance();
        lance38.setNumero("38. ");
        lance38.setJogador(jogador2);
        lance38.setPeca("Rainha");
        lance38.setPosicaoOrigem("b", "2");
        lance38.setPosicaoDestino("a", "1");
        partida.lances.add(lance38);

        Lance lance39 = new Lance();
        lance39.setNumero("39. ");
        lance39.setJogador(jogador1);
        lance39.setPeca("Rei");
        lance39.setPosicaoOrigem("f", "1");
        lance39.setPosicaoDestino("e", "2");
        partida.lances.add(lance39);

        Lance lance40 = new Lance();
        lance40.setNumero("40. ");
        lance40.setJogador(jogador2);
        lance40.setPeca("Cavalo");
        lance40.setPosicaoOrigem("b", "8");
        lance40.setPosicaoDestino("a", "6");
        partida.lances.add(lance40);

        Lance lance41 = new Lance();
        lance41.setNumero("41. ");
        lance41.setJogador(jogador1);
        lance41.setPeca("Cavalo");
        lance41.setPosicaoOrigem("f", "5");
        lance41.setPosicaoDestino("g", "7");
        partida.lances.add(lance41);

        Lance lance42 = new Lance();
        lance42.setNumero("42. ");
        lance42.setJogador(jogador2);
        lance42.setPeca("Rei");
        lance42.setPosicaoOrigem("e", "8");
        lance42.setPosicaoDestino("d", "8");
        partida.lances.add(lance42);

        Lance lance43 = new Lance();
        lance43.setNumero("43. ");
        lance43.setJogador(jogador1);
        lance43.setPeca("Rainha");
        lance43.setPosicaoOrigem("f", "3");
        lance43.setPosicaoDestino("f", "6");
        partida.lances.add(lance43);

        Lance lance44 = new Lance();
        lance44.setNumero("44. ");
        lance44.setJogador(jogador2);
        lance44.setPeca("Cavalo");
        lance44.setPosicaoOrigem("g", "8");
        lance44.setPosicaoDestino("f", "6");
        partida.lances.add(lance44);

        Lance lance45 = new Lance();
        lance45.setNumero("45. ");
        lance45.setJogador(jogador1);
        lance45.setPeca("Bispo");
        lance45.setPosicaoOrigem("d", "6");
        lance45.setPosicaoDestino("e", "7");
        partida.lances.add(lance45);
        
        partida.lePartida();
        System.out.println("Xeque-mate!");
    }
}
