# Professor Bertoti - Engenharia de Software na Fatec

# Atividade 1

### Comentando trechos do livro "Software engineering at Google"
livro: https://abseil.io/resources/swe-book

>"Withain Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software : engineering after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomesnsion to programming. Cubes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, mmimaintenance). The addition of time adds an important new dimeension to programming."

>"We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth."

- Programar é uma parte importante do software, mas a engenharia traz uma reflexão importante sobre como será a vida útil desse software ao decorrer do tempo, envolvendo modificações, manutenção e escalabilidade. É imprescindível que a engenharia e o programar andem juntos, afim de atingir a maior qualidade de produto agora e no futuro visando as prioridades do produto. 

# Atividade 2

### Conceito de Trade-off (Troca):

O trade-off envolve avaliar o que será mais importante e o que pode ser aceito como uma "perda". Alguns exemplos são:

**- Java:** Priorizou a portabilidade em detrimento do desempenho otimizado. Isso significa que uma aplicação Java pode rodar em qualquer equipamento que tenha a JDK instalada, como cafeteiras, celulares, servidores, entre outros, mas acaba tendo menor controle sobre o hardware comparado a linguagens como C++ e C. Essas linguagens com maior controle de hardware acabam sendo mais usadas em aplicações que tem como prioridade controle e segurança, como aviões, carros e foguetes.

**- Site da Amazon:** Optou pela fluidez em vez de um front-end mais elaborado com animações modernas. Essa escolha permite que a Amazon lide com um grande número de conexões simultâneas, mantendo o site estável para usuários de dispositivos mais "fracos".

**- Python**:** Prioriou a facilidade ao desempenho, o que foi uma escolha chave, na qual tornou python uma das linguagens mais usadas, não só para desenvolvimento de software para IA, mas para criar algoritmos que conseguem lidar e apresentar ideias sobre muitos dados, sendo uma ferramenta muito utilizada nas áreas de estatística.

# Atividade 3

### Comentando Trade-off de arquiteturas:
**Layered Architecture Style(Arquitetura em camadas):**
- Pontos positivo: Alta simplicidade, barato e confiável.
- Pontos negativos: Dificil de escalar(maior número clientes), menos tolerância a erros devido ao alto acoplamento, visto que uma camada só pode conversar com a camada acima e abaixo.
- Uso: Usado em protocolos de rede como UDP, TCP e HTTP, devido a segurança no processo, onde se houver falha em um ponto, a informação deve ser invalidada.

**Pipeline Architecture Style(Arquitetura em pipeline):**
- Pontos positivo: Modularidade, simplicidade, barato, relativamente fácil de testar e confiável.
- Pontos negativos: Dificil de escalar(maior número clientes), menos tolerância a erros devido ao alto acoplamento, visto que uma camada só pode conversar com a camada acima e abaixo.
- Uso: Compiladores, processamento de gráficos, linguagem natural e de vídeo, devido a necessidade de vários filtros de processamento até o produto final.
  
  
**Microkernel Architecture Style(Arquitetura em camadas):**
- Pontos positivo: Modularidade, custo, segurança, simplicidade e testabilidade.
- Pontos negativos: Complexidade, tolerância a erros. 
- Uso: Sistema Operacionais e embarcados, devido o gerenciamento de memória e a comunicação entre os processos principais e secundários.

**Service-based Architecture Style(Arquitetura baseada em serviços):**
- Pontos positivo: Implementação, escabilidade, tolerância a falhas, custo, confiabilidade, realização de testes e modularidade
- Pontos negativos: Complexidade de integração de serviçõs em diferentes plataformas.
- Uso: Comercios eletrônicos, flexíbilidade, confiavel e fácil de dar manutenção.

**Event-driven Architecture Style(Arquitetura baseada em eventos):**
- Pontos positivo: Evolução de novas funcionalidades, tolerância a falhas, performace e escalabidade.
- Pontos negativos: Complexidade e testabilidade.
- Uso: Internet das coisas, sistema de sensores, na qual após o disparo do sinal (trigger) uma lógica é feita com a entrada, para gerar uma saída, como a velocidade ou um sinal elétrico.

**Event-driven Architecture Style(Arquitetura baseada em eventos):**
- Pontos positivo: Evolução de novas funcionalidades, tolerância a falhas, performace e escalabidade.
- Pontos negativos: Complexidade e testabilidade.
- Uso: Usado em sistemas de jogos online, devido a necessidade de atualizar o status para todos os jogadores. Também usado em internet das coisas, sistema de sensores, na qual após o disparo do sinal (trigger) uma lógica é feita com a entrada, para gerar uma saída, como a velocidade ou um sinal elétrico.

**Microservices Architecture (Arquitetura de microsserviços):**
- Pontos positivo:  Implementação, implementação de novas funcionalidades, modularidade e escalabilidade de novos clientes.
- Pontos negativos: Custo alto e complexo
- Uso: Amazon prime, devido a necessidade de estar constantemente alterando funcionalidades, para um grande número de clientes.

# Atividade 4

### Defina sua arquitetura debatendo tradeoffs com os requisitos não funcionais comentados em aula:
**Model-View-Controller (MVC):**

- Model: Representa os dados e a lógica de negócios. Ele é responsável por lidar com a manipulação e validação dos dados.
- View: É a camada de apresentação. Ela exibe as informações ao usuário e recebe entradas do usuário.
- Controller: Faz a mediação entre a View e o Model. Ele recebe entradas do usuário da View, processa essas entradas com a lógica de negócios do Model e atualiza a View de acordo.

**Trade-offs com requisitos não funcionais:**

- Desempenho: A separação de responsabilidades no MVC pode levar a uma maior complexidade e, potencialmente, a um desempenho mais lento devido ao processamento adicional para coordenar entre as camadas.
- Escalabilidade: A estrutura MVC pode ser facilmente escalável, pois permite a separação de responsabilidades, facilitando a manutenção e o desenvolvimento paralelo.
- Manutenibilidade: A separação clara de responsabilidades entre as camadas facilita a manutenção, já que as alterações em uma parte do sistema geralmente têm menos impacto nas outras partes.
- Segurança: A separação de camadas permite implementar medidas de segurança em diferentes níveis. Por exemplo, a validação de entrada pode ser feita no Controller, enquanto a autenticação e autorização podem ser tratadas em outras camadas.

# Atividade 5
**Diagrama de classes de uma das partes da arquitetura:**
![image](https://github.com/MateusMSoares/bertoti/assets/74261014/2615b781-915d-4ca6-9f34-51239bf2fa50)


