package com.example.collegearena;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Csesem6Activity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Credits> creditsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csesem6);
        recyclerView=findViewById(R.id.recyclerview);

        initData();
        setRecyclerView();
    }
    private void setRecyclerView() {
        CreditsAdapter creditsAdapter = new CreditsAdapter(creditsList);
        recyclerView.setAdapter(creditsAdapter);
        recyclerView.setHasFixedSize(true);
    }

    private void initData() {
        creditsList = new ArrayList<>();
        creditsList.add(new Credits("COMPILER DESIGN","L:3 T:0 P:4 Credits:5","","Module 1 \n\n" +
                "Introduction: Phases of compilation and overview." +
                "Lexical Analysis (scanner): Regular languages, finite automata, regular expressions, from regular " +
                "expressions to finite automata, scanner generator (lex, flex).\n\n" +
                "Module 2 \n\n" +
                "Syntax Analysis (Parser): Context-free languages and grammars, push-down automata, LL(1) " +
                "gram-mars and top-down parsing, operator grammars, LR(O), SLR(1), LR(1), LALR(1) grammars " +
                "and bottom-up parsing, ambiguity and LR parsing, LALR(1) parser generator (yacc, bison).\n\n" +
                "Module 3 \n\n" +
                "Semantic Analysis: Attribute grammars, syntax directed definition, evaluation and flow of attribute " +
                "in a syntax tree. " +
                "Symbol Table: Its structure, symbol attributes and management. Run-time environment: " +
                "Procedure activation, parameter passing, value return, memory allocation, and scope. \n\n" +
                "Module 4 \n\n" +
                "Intermediate Code Generation: Translation of different language features, different types of " +
                "intermediate forms. " +
                "Code Improvement (optimization) Analysis: control-flow, data-flow dependence etc.; Code " +
                "improvement local optimization, global optimization, loop optimization, peep-hole optimization " +
                "etc. " +
                "Architecture dependent code improvement: instruction scheduling (for pipeline), loop " +
                "optimization (for cache memory) etc. Register allocation and target code generation. \n\n" +
                "Module 5 \n\n" +
                "Advanced topics: Type systems, data abstraction, compilation of Object Oriented features and " +
                "non-imperative programming languages.\n\n\n" +
                "Suggested Books:\n\n" +
                "1. Compilers Principles Techniques And Tools by Alfred V. Aho, Ravi Sethi, Jeffery D. " +
                "Ullman. Pearson Education.\n" +
                "2. Compiler Design by Santanu Chattopadhyay. PHI\n" +
                "3. Modern Compiler Design by Dick Grune, E. Bal. Ceriel, J. H. Jacobs, and Koen G. " +
                "Langendoen, Viley Dreamtech.\n\n\n"));
        creditsList.add(new Credits("COMPUTER NETWORKS","L:3 T:0 P:4 Credits:5","","Module 1 \n\n" +
                "Data communication Components: Representation of data and its flow Networks , " +
                "Various Connection Topology, Protocols and Standards, OSI model, Transmission " +
                "Media, LAN: Wired LAN, Wireless LANs, Connecting LAN and Virtual LAN, " +
                "Techniques for Bandwidth utilization: Multiplexing - Frequency division, Time " +
                "division and Wave division, Concepts on spread spectrum.\n\n" +
                "Module 2 \n\n" +
                "Data Link Layer and Medium Access Sub Layer: Error Detection and Error " +
                "Correction - Fundamentals, Block coding, Hamming Distance, CRC; Flow Control " +
                "and Error control protocols - Stop and Wait, Go back – N ARQ, Selective Repeat " +
                "ARQ, Sliding Window, Piggybacking, Random Access, Multiple access protocols -" +
                "Pure ALOHA, Slotted ALOHA, CSMA/CD,CDMA/CA\n\n" +
                "Module 3 \n\n" +
                "Network Layer: Switching, Logical addressing – IPV4, IPV6; Address mapping " +
                "- ARP, RARP, BOOTP and DHCP–Delivery, Forwarding and Unicast Routing " +
                "protocols.\n\n" +
                "Module 4 \n\n" +
                "Transport Layer: Process to Process Communication, User Datagram " +
                "Protocol (UDP), Transmission Control Protocol (TCP), SCTP Congestion Control; " +
                "Quality of Service, QoS improving techniques: Leaky Bucket and Token Bucket " +
                "algorithm.\n\n" +
                "Module 5 \n\n" +
                "Application Layer: Domain Name Space (DNS), DDNS, TELNET, EMAIL, File " +
                "Transfer Protocol (FTP), WWW, HTTP, SNMP, Bluetooth, Firewalls, Basic concepts " +
                "of Cryptography.\n\n\n" +
                "Suggested books\n\n" +
                "1. Data Communication and Networking, 4th Edition, Behrouz A. Forouzan, " +
                "McGraw- Hill.\n" +
                "2. Data and Computer Communication, 8th Edition, William Stallings, Pearson " +
                "Prentice Hall India.\n\n\n"));
        creditsList.add(new Credits("MACHINE LEARNING","L:3 T:1 P:0 Credits:4","","Module 1 \n\n" +
                "Introduction: Basic definitions, Linear Algebra, Statistical learning theory, types of learning, " +
                "hypothesis space and Inductive bias, evaluation and cross validation, Optimization.\n\n" +
                "Module 2 \n\n" +
                "Statistical Decision Theory, Bayesian Learning (ML, MAP, Bayes estimates, Conjugate priors), " +
                "Linear Regression, Ridge Regression, Lasso, Principal Component Analysis, Partial Least " +
                "Squares\n\n" +
                "Module 3 \n\n" +
                "Linear Classification, Logistic Regression, Linear Discriminant Analysis, Quadratic Discriminant " +
                "Analysis, Perceptron, Support Vector Machines + Kernels, Artificial Neural Networks + Back " +
                "Propagation, Decision Trees, Bayes Optimal Classifier, Naive Bayes.\n\n" +
                "Module 4 \n\n" +
                "Hypothesis testing, Ensemble Methods, Bagging Adaboost Gradient Boosting, Clustering, Kmeans, K-medoids, Density-based Hierarchical, Spectral .\n\n" +
                "Module 5 \n\n" +
                "Expectation Maximization, GMMs, Learning theory Intro to Reinforcement Learning , Bayesian " +
                "Networks.\n\n\n" +
                "Suggested books:\n\n" +
                "1. Machine Learning. Tom Mitchell. First Edition, McGraw- Hill, 1997\n" +
                "2. Introduction to Machine Learning Edition 2, by Ethem Alpaydin\n\n\n"));
        creditsList.add(new Credits("Elective - I","L:3 T:0 P:4 Credits:5","","ehfewygre"));
        creditsList.add(new Credits("Elective - I","L:3 T:0 P:4 Credits:5","","ehfewygre"));
    }
}