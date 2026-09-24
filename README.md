<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:2c5364,100:00b09b&height=220&section=header&text=E-Commerce%20Test%20Automation&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=38&desc=End-to-End%20Selenium%20%2B%20TestNG%20UI%20Test%20Suite&descAlignY=58&descSize=18" width="100%"/>

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&weight=600&size=22&duration=2500&pause=800&color=2C5364&center=true&vCenter=true&width=650&lines=Selenium+%2B+TestNG+%2B+Maven;Page+Object+Model+Architecture;Custom+TestNG+Listeners;Full+Shopping+Flow+Coverage" alt="Typing SVG" />

<br/>

[![Java](https://img.shields.io/badge/Java-8%2B-orange?style=for-the-badge&logo=openjdk)](https://www.oracle.com/java/)
[![Selenium](https://img.shields.io/badge/Selenium-WebDriver-43B02A?style=for-the-badge&logo=selenium)](https://www.selenium.dev/)
[![TestNG](https://img.shields.io/badge/TestNG-Framework-orange?style=for-the-badge)](https://testng.org/)
[![Maven](https://img.shields.io/badge/Build-Maven-C71A36?style=for-the-badge&logo=apachemaven)](https://maven.apache.org/)
[![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)](#license)

<br/>

![Profile Views](https://komarev.com/ghpvc/?username=ecommerce-test-automation&label=Repo%20Views&color=2c5364&style=flat-square)
[![GitHub stars](https://img.shields.io/github/stars/<your-username>/ecommerce-test-automation?style=social)](https://github.com/<your-username>/ecommerce-test-automation/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/<your-username>/ecommerce-test-automation?style=social)](https://github.com/<your-username>/ecommerce-test-automation/network/members)

<br/>

[Overview](#-overview) •
[Tech Stack](#-tech-stack) •
[Test Coverage](#-test-coverage) •
[Project Structure](#-project-structure) •
[Getting Started](#-getting-started) •
[Running Tests](#-running-tests) •
[Reports](#-test-reports) •
[Contributing](#-contributing)

</div>

<img src="https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.gif" width="100%">

---

## 📖 Overview

This is a **Selenium WebDriver + TestNG** automation framework built to validate the complete shopping journey of an e-commerce web application — from browsing and product search through to cart management, checkout, registration, and subscriptions. The framework follows the **Page Object Model (POM)** and uses **custom TestNG listeners** for enhanced test execution reporting.

### ✨ Key Features

- 🧩 **Page Object Model** architecture for clean, maintainable test code
- 🎧 **Custom TestNG Listener** (`TestListener.java`) for lifecycle hooks, logging, and reporting
- 🛒 **Full shopping-flow coverage** — search, cart, checkout, and order placement
- 👤 **Account management tests** — registration, login, logout, subscriptions
- ⭐ **Product interaction tests** — reviews, recommendations, quantity updates, categories
- 📝 Auto-generated **TestNG HTML/XML reports** after every run
- 🔧 **Maven**-managed dependencies and build lifecycle

---

## 🛠 Tech Stack

| Category | Technology |
|---|---|
| **Language** | Java 8+ |
| **Test Framework** | TestNG |
| **Build Tool** | Maven |
| **Browser Automation** | Selenium WebDriver |
| **Execution Hooks** | Custom TestNG Listeners |
| **IDE** | Eclipse |

---

## 🧪 Test Coverage

<div align="center">

| Module | Covers |
|---|---|
| 🔐 **Auth & Account** | `Login`, `LogOut`, `Register`, `Verify_Subscription`, `verify_subscription_cartPage` |
| 🛍️ **Product Discovery** | `Search_product`, `View_category`, `Verify_all_product_page`, `Recommended_items` |
| 🛒 **Cart & Checkout** | `Add_toCart`, `Remove_cart`, `ViewCartProduct`, `Product_quantity`, `Place_order_Resister_checkout` |
| ⭐ **Engagement** | `Review_on_product`, `Contact_us` |
| ⚙️ **Core Utilities** | `Functionality`, `TestListener` (ITlisteners) |

</div>

---

## 📂 Project Structure

```
ecommerce-test-automation/
├── src/
│   ├── main/java/
│   │   └── ITlisteners/
│   │       ├── TestListener.java        # Custom TestNG execution listener
│   │       └── package-info.java
│   └── test/
│       ├── java/
│       │   └── package_pro/
│       │       ├── Add_toCart.java
│       │       ├── Contact_us.java
│       │       ├── Functionality.java
│       │       ├── LogOut.java
│       │       ├── Login.java
│       │       ├── Place_order_Resister_checkout.java
│       │       ├── Product_quantity.java
│       │       ├── Recommended_items.java
│       │       ├── Register.java
│       │       ├── Remove_cart.java
│       │       ├── Review_on_product.java
│       │       ├── Search_product.java
│       │       ├── Verify_Subscription.java
│       │       ├── Verify_all_product_page.java
│       │       ├── ViewCartProduct.java
│       │       ├── View_category.java
│       │       ├── verify_subscription_cartPage.java
│       │       └── package-info.java
│       └── resources/                   # Test data / config files
├── test-output/                         # TestNG execution reports (generated)
├── target/                              # Compiled build output (git-ignored)
├── pom.xml                              # Maven dependencies & build config
└── testng.xml                           # TestNG suite configuration
```

---

## ✅ Prerequisites

- [Java JDK 8+](https://www.oracle.com/java/technologies/downloads/)
- [Maven](https://maven.apache.org/download.cgi)
- [Eclipse IDE](https://www.eclipse.org/downloads/) with **TestNG** and **EGit** plugins
- Chrome/Firefox browser with a matching WebDriver version

---

## 🚀 Getting Started

1. **Clone the repository**
   ```bash
   git clone https://github.com/<your-username>/ecommerce-test-automation.git
   cd ecommerce-test-automation
   ```

2. **Import into Eclipse**
   `File > Import > Existing Maven Projects` → select the cloned folder

3. **Resolve dependencies**
   Right-click the project → `Maven > Update Project`

4. **Configure environment**
   Update base URL, credentials, and browser settings in the relevant config file as needed

---

## ▶️ Running Tests

**Option 1 — Via Eclipse**
Right-click `testng.xml` → **Run As → TestNG Suite**

**Option 2 — Via Maven CLI**
```bash
mvn test
```

> 💡 `TestListener.java` hooks into test execution to provide enhanced logging and reporting throughout the run.

---

## 📊 Test Reports

After execution, TestNG automatically generates reports in the `test-output/` directory:

- `test-output/index.html` — interactive summary report
- `test-output/emailable-report.html` — shareable summary report

---

## 🗺 Roadmap

- [ ] Integrate CI/CD pipeline (GitHub Actions / Jenkins)
- [ ] Add cross-browser parallel execution
- [ ] Extend reporting with Extent/Allure reports
- [ ] Add Dockerized execution environment

---

## 🤝 Contributing

Contributions are welcome! To contribute:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/your-feature`)
3. Commit your changes (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature/your-feature`)
5. Open a Pull Request

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).

---

## 👤 Author

**Mathubalan K**

[![GitHub](https://img.shields.io/badge/GitHub-Mathubalan18-181717?style=for-the-badge&logo=github)](https://github.com/Mathubalan18)

<div align="center">

### ⭐ If you find this project useful, consider giving it a star!

<img src="https://media.giphy.com/media/LnQjpWaON8nhr21vNW/giphy.gif" width="120">

</div>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:00b09b,50:2c5364,100:0f2027&height=150&section=footer&animation=fadeIn"/>
