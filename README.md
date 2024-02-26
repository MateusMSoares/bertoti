# Professor Bertoti
## Engenharia de Software na Fatec

### Comentando trechos do livro "Software engineering at Google"
>"Withain Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software : engineering after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomesnsion to programming. Cubes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, mmimaintenance). The addition of time adds an important new dimeension to programming."

>"We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth."

- Programar é uma parte importante do software, mas a engenharia traz uma reflexão importante sobre como será a vida útil desse software ao decorrer do tempo, envolvendo modificações, manutenção e escalabilidade. É imprescindível que a engenharia e o programar andem juntos, afim de atingir a maior qualidade no produto agora e no futuro visando qual o foco da funcionalidade. 

### Conceito de Trade-off (Troca):

O trade-off envolve avaliar o que será mais importante e o que pode ser aceito como uma "perda". Alguns exemplos são:

- **Java**: Priorizou a portabilidade em detrimento do desempenho otimizado. Isso significa que uma aplicação Java pode rodar em qualquer equipamento que tenha a JDK instalada, como cafeteiras, celulares, servidores, entre outros, mas acaba tendo menor controle sobre o hardware comparado a linguagens como C++ e C. Essas linguagens com maior controlede hardware acabam sendo mais usadas em aplicações que tem como prioridade controle e segurança, como aviões, carros e foguetes.

- **Site da Amazon**: Optou pela fluidez em vez de um front-end mais elaborado com animações modernas. Essa escolha permite que a Amazon lide com um grande número de conexões simultâneas, mantendo o site estável para usuários de dispositivos mais "fracos".

- **Python**: Prioriou a facilidade ao desempenho, o que foi uma escolha chave, na qual tornou python uma das linguagens mais usadas, não só para desenvolvimento de software para IA, mas para criar algoritmos que conseguem lidar e apresentar ideias sobre muito dados, sendo uma ferramenta muito utilizada nas áreas de estatística.


https://abseil.io/resources/swe-book
