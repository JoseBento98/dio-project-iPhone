+-------------------+
|  ReprodutorMusical|
+-------------------+
| +tocar(): void    |
| +pausar(): void   |
| +selecionarMusica(musica: String): void |
+-------------------+

+-------------------+
|  AparelhoTelefonico|
+-------------------+
| +ligar(numero: String): void |
| +atender(): void |
| +iniciarCorreioVoz(): void |
+-------------------+

+-------------------+
|  NavegadorNaInternet|
+-------------------+
| +exibirPagina(url: String): void |
| +adicionarNovaAba(): void |
| +atualizarPagina(): void |
+-------------------+

+--------------------+
| Dispositivo        |
+--------------------+
| +tocar(): void     |
| +pausar(): void    |
| +selecionarMusica(musica: String): void |
| +ligar(numero: String): void |
| +atender(): void   |
| +iniciarCorreioVoz(): void |
| +exibirPagina(url: String): void |
| +adicionarNovaAba(): void |
| +atualizarPagina(): void |
+--------------------+
| <<implements>> ReprodutorMusical |
| <<implements>> AparelhoTelefonico |
| <<implements>> NavegadorNaInternet |
+--------------------+
