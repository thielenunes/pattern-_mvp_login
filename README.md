

View - em nosso caso é o formulário que exibirá os dados, não contém regra alguma do negócio a não ser disparar eventos que notificam mudança de estado dos dados que ele exibe e processamento próprio dele, como por exemplo código para fechar o formulário. Um objeto view implementa uma interface que expõe campos e eventos que o presenter necessita.
Model - São os objetos que serão manipulados. Um objeto Model implementa uma interface que expõe os campos que o presenter irá atualizar quando sofrerem alteração na view.
Presenter - É a ligação entre View e Model, possui papel de mediador entre eles. Ele é encarregado de atualizar o view quando o model é alterado e de sincronizar o model em relação ao view.



Aplicação desenvolvida por [Thiele Nunes](https://github.com/thielenunes)

Usando layout padrão de tela de login, encontrado no google image. 

# patternMVPlogin
Projeto criado com o intuito de estudar sobre o padrão MVP (Model-View-Presenter).

### Funcionalidades

- Campo de inserção de usuário e senha, que foram mocados no código 
- Valida se o usuário e senha está correto, se não estiver envia uma mensagem de erro
- Opção de clicar para enviar usuário e senha

### Tecnologias

- Kotlin
- Android Studio
- pattern MVP

### Conceitos aplicados

- Activity
- Consumo de dados "mocados"
- Estrutura de Model View Presenter

