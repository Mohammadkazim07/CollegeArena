package com.example.collegearena;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Csesem5Activity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Credits> creditsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csesem5);
    }
    private void setRecyclerView() {
        CreditsAdapter creditsAdapter = new CreditsAdapter(creditsList);
        recyclerView.setAdapter(creditsAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView=findViewById(R.id.recyclerview);

        initData();
        setRecyclerView();

    }

    private void initData() {
        creditsList = new ArrayList<>();
        creditsList.add(new Credits("DATABASE AND MANAGEMENT SYSREMS","L:3 T:0 P:4 Credits:5","",
                "Module 1 \n\n" +
                        "Database system architecture: Data Abstraction, Data Independence, Data Definition Language " +
                        "(DDL), Data Manipulation Language (DML)." +
                        "Data models: Entity-relationship model, network model, relational and object oriented data models, " +
                        "integrity constraints, data manipulation operations." +
                        "Module 2 \n\n" +
                        "Relational query languages: Relational algebra, Tuple and domain relational calculus, SQL3, " +
                        "DDL and DML constructs, Open source and Commercial DBMS - MYSQL, ORACLE, DB2, SQL " +
                        "server." +
                        "Relational database design: Domain and data dependency, Armstrong’s axioms, " +
                        "Normal forms, Dependency preservation, Lossless design." +
                        "Query processing and optimization: Evaluation of relational algebra expressions, " +
                        "Query equivalence, Join strategies, Query optimization algorithms.\n\n" +
                        "Module 3 \n\n" +
                        "Storage strategies: Indices, B-trees, hashing.\n\n" +
                        "Module 4 \n\n" +
                        "Transaction processing: Concurrency control, ACID property, Serializability of scheduling, Locking " +
                        "and timestamp based schedulers, Multi-version and optimistic Concurrency Control schemes, Database " +
                        "recovery.\n\n" +
                        "Module 5 \n\n" +
                        "Database Security: Authentication, Authorization and access control, DAC, MAC and RBAC models, " +
                        "Intrusion detection, SQL injection.\n\n" +
                        "Module 6 \n\n" +
                        "Advanced topics: Object oriented and object relational databases, Logical databases, Web databases, " +
                        "Distributed databases, Data warehousing and data mining.\n\n\n" +
                        "Suggested books:\n\n" +
                        "1. “Database System Concepts”, 6th Edition by Abraham Silberschatz, Henry F. Korth, S. " +
                        "Sudarshan, McGraw-Hill\n" +
                        "2. “Principles of Database and Knowledge – Base Systems”, Vol 1 by J. D. Ullman, Computer " +
                        "SciencePress.\n" +
                        "3. “Fundamentals of Database Systems”, 5th Edition by R. Elmasri and S. Navathe, Pearson Education\n" +
                        "4. “Foundations of Databases”, Reprint by Serge Abiteboul, Richard Hull, Victor Vianu, AddisonWesley\n\n\n"));
        creditsList.add(new Credits("FORMAL LANGUAGE & AUTOMATA THEORY","L:3 T:1 P:0 Credits:4","",
                "Module 1 \n\n" +
                        "Introduction: Alphabet, languages and grammars, productions and derivation, Chomsky " +
                        "hierarchy of languages. " +
                        "Regular languages and finite automata: Regular expressions and languages, deterministic " +
                        "finite automata (DFA) and equivalence with regular expressions, nondeterministic finite " +
                        "automata (NFA) and equivalence with DFA, regular grammars and equivalence with finite " +
                        "automata, properties of regular languages, pumping lemma for regular languages, " +
                        "minimization of finite automata.\n\n" +
                        "Module 2 \n\n" +
                        "Context-free languages and pushdown automata: Context-free grammars (CFG) and " +
                        "Context-free languages (CFL), Chomsky and Greibach normal forms, nondeterministic " +
                        "pushdown automata (PDA) and equivalence with CFG, parse trees, ambiguity in CFG, " +
                        "pumping lemma for context-free languages, deterministic pushdown automata, closure " +
                        "properties of CFLs. \n\n" +
                        "Module 3 \n\n" +
                        "Context-sensitive languages: Context-sensitive grammars (CSG) and Context-sensitive " +
                        "languages, linear bounded automata and equivalence with CSG. \n\n" +
                        "Module 4 \n\n" +
                        "Turing machines: The basic model for Turing machines (TM), Turing recognizable " +
                        "(Recursively enumerable) and Turing-decidable (recursive) languages and their closure " +
                        "properties, variants of Turing machines, nondeterministic TMs and equivalence with " +
                        "deterministic TMs, unrestricted grammars and equivalence with Turing machines, TMs as " +
                        "enumerators. \n\n" +
                        "Module 5 \n\n" +
                        "Undecidability: Church-Turing thesis, universal Turing machine, the universal and " +
                        "diagonalization languages, reduction between languages and Rice’s theorem, undecidable " +
                        "problems about languages.\n\n\n" +
                        "Suggested reference books:\n\n" +
                        "1. Harry R. Lewis and Christos H. Papadimitriou, Elements of the Theory of " +
                        "Computation, Pearson EducationAsia.\n" +
                        "2. Dexter C. Kozen, Automata and Computability, Undergraduate Texts in Computer " +
                        "Science, Springer.\n" +
                        "3. Michael Sipser, Introduction to the Theory of Computation, PWS Publishing.\n" +
                        "4. John Martin, Introduction to Languages and the Theory of Computation, Tata " +
                        "McGraw Hill.\n\n\n"));
        creditsList.add(new Credits("ARTIFICIAL INTELLIGENCE","L:3 T:0 P:0 Credits:3","",
                "Module 1 \n\n" +
                        "Introduction: Overview, Turing test, Intelligent agents. Problem Solving: Solving Problems by " +
                        "Searching: Uninformed search - Depth First Search, Breadth First Search, DFID, Heuristic search -" +
                        "Generate and Test, Best First Search, Beam Search, Hill Climbing, A*, Problem reduction search –" +
                        "AND/OR Graphs, AO*, Constraint satisfaction, Means-ends analysis, Stochastic search methods -" +
                        "Simulated Annealing, Particle Swarm Optimization, Game Playing - Minimax algorithm, Alphabeta pruning\n\n" +
                        "Module 2 \n\n" +
                        "Knowledge and Reasoning: Building a knowledge base - Propositional logic, first order logic, " +
                        "Inference in first order logic, Resolution – refutation proofs, Theorem Proving in First Order Logic;" +
                        "Planning, partial order planning, Uncertain Knowledge and Reasoning, Probabilities, Bayesian " +
                        "Networks\n\n" +
                        "Module 3 \n\n" +
                        "Learning: Overview of different forms of learning: unsupervised, supervised, semi-supervised, Kmeans clustering algorithm, Decision Trees, Neural Networks, Deep Learning. \n\n" +
                        "Module 4 \n\n" +
                        "Advanced topics: Introduction to Computer Vision, Natural Language Processing, Expert Systems, " +
                        "Robotics, Genetic Algorithm, \n\n\n" +
                        "Text Books\n\n" +
                        "1. S. Russell and P. Norvig, “Artificial Intelligence: A Modern Approach,” Prentice Hall\n" +
                        "2. E. Rich, K. Knight and S. B. Nair, “Artificial Intelligence,” TMH\n\n\n"));
        creditsList.add(new Credits("SOFTWARE ENGINEERING","L:3 T:0 P:0 Credits:3","",
                "Module 1\n\n"+"Introduction: What is Software Engineering and its history, software crisis, Evolution of a " +
                        "Programming System Product, Characteristics of Software, Brooks’ No Silver Bullet, and Software " +
                        "Myths, Software Development Life Cycles: Software Development Process, The Code-and-Fix " +
                        "model, The Waterfall model, The Evolutionary Model, The Incremental Implementation, " +
                        "Prototyping, The Spiral Model, Software Reuse, Critical Comparisons of SDLC models, An " +
                        "Introduction to Non-Traditional Software Development Process: Rational Unified Process, Rapid " +
                        "Application Development, Agile Development Process.\n\n" +
                        "Module 2 \n\n" +
                        "Requirements: Importance of Requirement Analysis, User Needs, Software Features and Software " +
                        "Requirements, Classes of User Requirements: Enduring and Volatile, Sub phases of Requirement " +
                        "Analysis, Functional and Nonfunctional requirements, Barriers to Eliciting User requirements, The " +
                        "software requirements document and SRS standards, Requirements Engineering, Case Study of SRS " +
                        "for a Real Time System. Tools for Requirements Gathering: Document Flow Chart, Decision Table, n" +
                        "Decision Tree, Introduction to nontraditional Requirements.\n\n" +
                        "Module 3 \n\n" +
                        "Software Design: Goals of good software design, Design strategies and methodologies, Data " +
                        "oriented software design, Coupling, Cohesion, Modular structure, Packaging, Structured Analysis: " +
                        "DFD, Data Dictionary, Structured Design: Structure chart, Object oriented design, Top-down and " +
                        "bottom-up approach, UML, UML Diagrams, Design patterns,.\n\n" +
                        "Module 4 \n\n" +
                        "Software Project Management: Overview of Project Manager Responsibilities & project " +
                        "planning, Software Measurement and Metrics: Line of Code (LOC), Function Point (FP) based " +
                        "measures, Various Size Oriented Measures: Halstead's software science, Project Size estimation" +
                        "Metrics Project Estimation, Techniques, COCOMO, Staffing Level Estimation, Scheduling, " +
                        "Organization & Team Structures Staffing, Risk Management.\n\n" +
                        "Module 5 \n\n" +
                        "Software Coding & Testing: Development: Selecting a language, Coding guidelines, Writing " +
                        "code, Code documentation. Testing process, Design of test cases, Functional Testing: Boundary " +
                        "value analysis, Equivalence class testing, Decision table testing, Cause effect graphing, Structural " +
                        "testing, Cyclomatic Complexity Measures: Control flow graphs, Path testing, Data flow and " +
                        "mutation testing, Unit testing, Integration and system testing, Debugging, Alpha & beta testing, " +
                        "testing tools & standards.\n\n" +
                        "Module 6 \n\n" +
                        "Software Maintenance: Management of maintenance, Maintenance process, Maintenance models, " +
                        "Regression testing, Reverse engineering, Software reengineering, Configuration management, " +
                        "documentation.\n\n" +
                        "Module 7 \n\n" +
                        "Software Reliability & Quality Management: Introduction to reliability and metrics to reliability " +
                        "measure, Overview of S/W Quality management System ISO 9000, SEI CMM.\n\n\n" +
                        "Text Book:\n\n" +
                        "1. Software Engineering: A Practitioner's Approach, R. S. Pressman, McGraw Hill\n" +
                        "2. Fundamental of Software Engg. By Rajib Mall 4th edition PHI\n" +
                        "3. A Concise Introduction to Software Engineering By Pankaj Jalote\n\n\n"));
        creditsList.add(new Credits("PROFESSIONAL SKILL DEVELOPMENT","L:3 T:0 P:0 Credits:3","",
                "Module 1 \n\n" +
                        "Communication skills: Public speaking, Group discussion, Gestures and body language & " +
                        "professional presentation skills\n\n" +
                        "Module 2 \n\n" +
                        "Interpersonal skills: Group dynamics, Negotiation skills, Leadership, Emotional intelligence\n\n" +
                        "Module 3 \n\n" +
                        "Employability and Corporate Skills: Time management and effective planning, Stress " +
                        "management, People skills, Team work, development of leadership qualities, Decision making " +
                        "and Negotiation skills, Positive attitude, Self-motivation, Professional ethics, Business etiquettes, " +
                        "balancing board room.\n\n" +
                        "Module 4 \n\n" +
                        "Business writing skills, Resume Writing. Interview Skills, Technical Presentation, Guest " +
                        "Lecture, Professional Ethics, Project Management, Entrepreneurship.\n\n\n" +
                        "Suggested reference books:\n\n" +
                        "1. “Personality Development and Soft Skills”, Barun Mitra, Oxford University Press.\n" +
                        "2. “Managing Soft Skills for Personality Development”, B.N. Ghosh, McGraw Hill. " +
                        "3. “Communication Skills and Soft Skills: An Integrated Approach”, E. " +
                        "Suresh Kumar, Pearson \n" +
                        "4. “Communication to Win”, Richard Denny, Kogan Page India Pvt. Ltd\n\n\n"));
        creditsList.add(new Credits("CONSTITUTION OF INDIA","L:3 T:0 P:0 Credits:0","",
                "\nThe Constitution of India is the supreme law of India. Parliament of India can not make " +
                        "any law which violates the Fundamental Rights enumerated under the Part III of the " +
                        "Constitution. The Parliament of India has been empowered to amend the Constitution under " +
                        "Article 368, however, it cannot use this power to change the “basic structure” of the " +
                        "constitution, which has been ruled and explained by the Supreme Court of India in " +
                        "its historical judgments. The Constitution of India reflects the idea of “Constitutionalism” – " +
                        "a modern and progressive concept historically developed by the thinkers of “liberalism” –" +
                        "an ideology which has been recognized as one of the most popular political ideology and " +
                        "result of historical struggles against arbitrary use of sovereign power by state. The historic " +
                        "revolutions in France, England, America and particularly European Renaissance and " +
                        "Reformation movement have resulted into progressive legal reforms in the form of " +
                        "“constitutionalism” in many countries. The Constitution of India was made by borrowing " +
                        "models and principles from many countries including United Kingdom and America." +
                        "The Constitution of India is not only a legal document but it also reflects social, " +
                        "political and economic perspectives of the Indian Society. It reflects India’s legacy of " +
                        "“diversity”. It has been said that Indian constitution reflects ideals of its freedom movement, " +
                        "however, few critics have argued that it does not truly incorporate our own ancient " +
                        "legal heritage and cultural values. No law can be “static” and therefore the Constitution of " +
                        "India has also been amended more than one hundred times. These amendments reflect " +
                        "political, social and economic developments since the year 1950. The Indian judiciary " +
                        "and particularly the Supreme Court of India has played an historic role as the guardian of " +
                        "people. It has been protecting not only basic ideals of the Constitution but also strengthened " +
                        "the same through progressive interpretations of the text of the Constitution. The judicial " +
                        "activism of the Supreme Court of India and its historic contributions has been recognized " +
                        "throughout the world and it gradually made it “as one of the strongest court in the world”.\n\n" +
                        "Course content:\n\n" +
                        "1. Meaning of the constitution law and constitutionalism\n" +
                        "2. Historical perspective of the Constitution of India\n" +
                        "3. Salient features and characteristics of the Constitution of India\n" +
                        "4. Scheme of the fundamental rights\n" +
                        "5. The scheme of the Fundamental Duties and its legal status\n" +
                        "6. The Directive Principles of State Policy – Its importance and implementation\n" +
                        "7. Federal structure and distribution of legislative and financial powers between the " +
                        "Union and the States\n" +
                        "8. Parliamentary Form of Government in India – The constitution powers and status of " +
                        "the President of India\n" +
                        "9. Amendment of the Constitutional Powers and Procedure\n" +
                        "10. The historical perspectives of the constitutional amendments in India\n" +
                        "11. Emergency Provisions: National Emergency, President Rule, Financial Emergency\n" +
                        "12. Local Self Government – Constitutional Scheme in India \n" +
                        "13. Scheme of the Fundamental Right to Equality\n" +
                        "14. Scheme of the Fundamental Right to certain Freedom under Article 19\n" +
                        "15. Scope of the Right to Life and Personal Liberty under Article 21.\n\n\n"));

    }
}