# Medsystem Conversor

[![Android CI](https://github.com/JPGC02/Medsystem_Conversor/workflows/Android%20CI/badge.svg)](https://github.com/JPGC02/Medsystem_Conversor/actions)
[![API](https://img.shields.io/badge/API-24%2B-brightgreen.svg)](https://android-arsenal.com/api?level=24)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](LICENSE)

## 📱 Sobre o Projeto

O Medsystem Conversor é um aplicativo Android desenvolvido para facilitar a conversão de unidades utilizadas na calibração de equipamentos médicos. Este projeto foi desenvolvido como parte do trabalho de conclusão da Usina de Projetos Experimentais (UPX 2).

### 🎯 Principais Funcionalidades

- Conversão de Vazão
- Conversão de cmH2O para mmHg
- Conversão de Watts RMS para Watts
- Conversão de unidades ECG
- Sistema de autenticação seguro
- Histórico de conversões
- Modo offline
- Tema claro/escuro

## 🚀 Tecnologias Utilizadas

- **Kotlin** - Linguagem principal
- **MVVM** - Padrão de arquitetura
- **Jetpack Components**
  - Navigation
  - Room Database
  - ViewModel
  - LiveData
  - DataBinding
- **Dagger Hilt** - Injeção de dependência
- **Retrofit** - Requisições HTTP
- **Coroutines** - Programação assíncrona
- **Material Design 3** - UI/UX
- **Unit Tests** - JUnit e Mockito
- **Security Crypto** - Criptografia de dados

## 📥 Instalação

1. Clone o repositório:
```bash
git clone https://github.com/JPGC02/Medsystem_Conversor.git
```

2. Abra o projeto no Android Studio

3. Configure o arquivo local.properties com suas credenciais:
```properties
sdk.dir=YOUR_ANDROID_SDK_PATH
```

4. Sincronize o projeto com o Gradle

5. Execute o aplicativo

## 🔧 Configuração do Ambiente de Desenvolvimento

### Requisitos
- Android Studio Hedgehog | 2023.1.1 ou superior
- JDK 17
- Android SDK 34
- Gradle 8.2

### Variáveis de Ambiente
Configure as seguintes variáveis no seu arquivo `local.properties`:
```properties
RELEASE_STORE_FILE=your_keystore_path
RELEASE_STORE_PASSWORD=your_keystore_password
RELEASE_KEY_ALIAS=your_key_alias
RELEASE_KEY_PASSWORD=your_key_password
```

## 🧪 Testes

### Executando Testes Unitários
```bash
./gradlew test
```

### Executando Testes Instrumentados
```bash
./gradlew connectedAndroidTest
```

## 📊 Arquitetura

O projeto segue a arquitetura MVVM (Model-View-ViewModel) com Clean Architecture:

```
app/
├── data/
│   ├── local/
│   ├── remote/
│   └── repository/
├── di/
├── domain/
│   ├── model/
│   ├── repository/
│   └── usecase/
├── presentation/
│   ├── common/
│   ├── converter/
│   ├── history/
│   └── settings/
└── util/
```

## 🔐 Segurança

- Implementação de criptografia para dados sensíveis
- Proteção contra SQL Injection
- Validação de entrada de dados
- Certificados SSL pinning
- Proteção contra screenshots em telas sensíveis

## 🤝 Contribuição

1. Fork o projeto
2. Crie sua Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a Branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## 📝 Licença

Este projeto está licenciado sob a Licença Apache 2.0 - veja o arquivo [LICENSE](LICENSE) para detalhes.

## 📬 Contato

João Paulo - [@_jpgc_](https://www.instagram.com/_jpgc_/)

Link do Projeto: [https://github.com/JPGC02/Medsystem_Conversor](https://github.com/JPGC02/Medsystem_Conversor)

## 🙏 Agradecimentos

- [Android Jetpack](https://developer.android.com/jetpack)
- [Material Design](https://material.io/design)
- [Kotlin](https://kotlinlang.org/)
- [Stack Overflow](https://stackoverflow.com/)