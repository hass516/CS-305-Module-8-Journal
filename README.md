# CS-305-Module-8-Journal
Reflection on Project Two: Artemis Financial Practices for Secure Software Report

1. Client Summary
My client, Artemis Financial, is a financial consulting company that manages sensitive customer and transaction data. The company wanted to strengthen the security of its web-based application and ensure that communications between the client and server were encrypted. Specifically, they asked for a secure solution to protect data in transit, identify existing vulnerabilities, and implement stronger encryption practices following industry standards.

2. My Performance and Importance of Secure Coding
I did well at identifying and addressing vulnerabilities in Artemis Financial’s software, especially through the use of OWASP Dependency-Check to locate known CVEs and by refactoring insecure HTTP communication to HTTPS using a self-signed certificate. Secure coding is critical because it protects user data, maintains trust, and prevents breaches that can harm a company’s reputation and finances. Strong software security directly adds value by ensuring compliance, maintaining operational integrity, and reducing long-term risk exposure.

3. Challenging or Helpful Part
The most challenging part of the vulnerability assessment was interpreting and mitigating dependency vulnerabilities found during static testing. It was helpful to learn how different versions of dependencies could expose the system to known exploits and how to update or suppress false positives. Understanding how to balance security patches without breaking application functionality was a valuable experience.

4. Increasing Layers of Security
I increased layers of security by implementing SSL/TLS encryption to secure network communication, ensuring that sensitive data was transmitted safely. I also added a checksum verification mechanism to verify file integrity. In the future, I would continue using tools like OWASP Dependency-Check, Snyk, and Burp Suite to assess vulnerabilities and follow the CIA triad (confidentiality, integrity, and availability) when deciding on mitigation techniques.

5. Verifying Functionality and Preventing New Vulnerabilities
After refactoring, I verified that the application remained functional and secure by successfully compiling and running it with HTTPS enabled. I tested the endpoint using https://localhost:8443/hash to ensure encrypted communication. I also reran the dependency scan to confirm that no new vulnerabilities had been introduced during the refactor. Functional testing confirmed that the application executed without errors and that all security layers were active.

6. Useful Tools and Practices
The most useful tools were OWASP Dependency-Check for vulnerability detection and Spring Boot configuration for implementing HTTPS. I also found Snyk and keytool valuable for managing certificates. Following secure coding practices like input validation, least privilege, and defensive programming will continue to guide my development work in future projects.

8. Demonstrating My Skills to Employers
Future employers could view this project as evidence of my ability to apply secure development practices, conduct vulnerability assessments, and implement encryption protocols in a professional environment. This artifact demonstrates that I can take a software application, identify its risks, mitigate vulnerabilities, and verify that security improvements are both functional and compliant.

