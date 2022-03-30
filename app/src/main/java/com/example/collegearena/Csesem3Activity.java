package com.example.collegearena;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Csesem3Activity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Credits> creditsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csesem3);

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
        creditsList.add(new Credits("ANALOG ELECTRONICS CIRCUITS","L:3 T:0 P:4 Credits:5","","Module 1\n\n" +
                "Diode circuits: P-N junction diode, I-V characteristics of a diode; review of half-wave and fullwave rectifiers, Zener diodes, clamping and clipping circuits. \n\n" +
                "Module 2 \n\n" +
                "BJT circuits: Structure and I-V characteristics of a BJT; BJT as a switch. BJT as an amplifier:" +
                "small-signal model, biasing circuits, current mirror; common-emitter, common-base and commoncollector amplifiers; Small signal equivalent circuits, high-frequency equivalent circuits.\n\n" +
                "Module 3 \n\n" +
                "MOSFET circuits: MOSFET structure and I-V characteristics. MOSFET as a switch. MOSFET as " +
                "an amplifier: small-signal model and biasing circuits, common-source, common-gate and " +
                "common-drain amplifiers; small signal equivalent circuits - gain, input and output impedances, transconductance, high frequency equivalent circuit. \n\n" +
                "Module 4 \n\n" +
                "Differential, multi-stage and operational amplifiers: Differential amplifier; power amplifier; " +
                "direct coupled multi-stage amplifier; internal structure of an operational amplifier, ideal op-amp, " +
                "non-idealities in an op-amp (Output offset voltage, input bias current, input offset current, slew " +
                "rate, gain bandwidth product)\n\n" +
                "Module 5 \n\n" +
                "Linear applications of op-amp: Idealized analysis of op-amp circuits. Inverting and non-inverting " +
                "amplifier, differential amplifier, instrumentation amplifier, integrator, active filter, P, PI and PID " +
                "controllers and lead/lag compensator using an op-amp, voltage regulator, oscillators (Wein bridge " +
                "and phase shift). Analog to Digital Conversion. \n\n" +
                "Module 6 \n\n" +
                "Nonlinear applications of op-amp: Hysteretic Comparator, Zero Crossing Detector, Square-wave and " +
                "triangular-wave generators. Precision rectifier, peak detector, Monoshot. \n\n\n" +
                "Suggested Books:\n" +
                "1. A S Sedra and K. C. Smith, “Microelectronic Circuits”, New York, Oxford University Press, 1998."+
            "2. J. V. Wait, L. P. Huelsman and G. A. Korn, “Introduction to Operational Amplifier theory and " +
                    "applications”, McGraw Hill U. S., 1992. \n" +
                    "3. J. Millman and A. Grabel, “Microelectronics”, McGraw Hill Education, 1988. \n" +
                    "4. P. Horowitz and W. Hill, “The Art of Electronics”, Cambridge University Press, 1989. \n" +
                    "5. P.R. Gray, R.G. Meyer and S. Lewis, “Analysis and Design of Analog Integrated Circuits”, John " +
                    "Wiley & Sons, 2001.\n\n\n"));
        creditsList.add(new Credits("DATA STRUCTURE AND ALGORITHMS","L:3 T:0 P:4 Credits:5","","Module 1 \n\n" +
                "Introduction: Basic Terminologies: Elementary Data Organizations, Data Structure " +
                "Operations: insertion, deletion, traversal etc.; Analysis of an Algorithm, Asymptotic " +
                "Notations, Time-Space trade off.\n\n" +
                "Module 2 \n\n" +
                "Stacks and Queues: ADT Stack and its operations: Algorithms and their complexity " +
                "analysis, Applications of Stacks: Expression Conversion and evaluation – " +
                "corresponding algorithms and complexity analysis. ADT queue, Types of Queue: " +
                "Simple Queue, Circular Queue, Priority Queue; Operations on each Type of Queues: " +
                "Algorithms and their analysis.\n\n" +
                "Module 3 \n\n" +
                "Linked Lists: Singly linked lists: Representation in memory, Algorithms of several " +
                "operations: Traversing, Searching, Insertion into, Deletion from linked list; Linked " +
                "representation of Stack and Queue, Header nodes, doubly linked list: operations on it " +
                "and algorithmic analysis; Circular Linked Lists: all operations their algorithms and " +
                "the complexity analysis.\n\n" +
                "Module 4 Lecture 12 hrs.\n\n" +
                "Searching, Sorting and Hashing: Linear Search and Binary Search Techniques and " +
                "their complexity analysis. Objective and properties of different sorting algorithms: " +
                "Selection Sort, Bubble Sort, Insertion Sort, Quick Sort, Merge Sort, Heap Sort; " +
                "Performance and Comparison among all the methods, Hashing.\n\n"+
                "Module 5 \n\n" +
                "Trees: Basic Tree Terminologies, Different types of Trees: Binary Tree, Threaded " +
                "Binary Tree, Binary Search Tree, AVL Tree; Tree operations on each of the trees and " +
                "their algorithms with complexity analysis. Applications of Binary Trees. B Tree, B+ " +
                "Tree: definitions, algorithms and analysis." +
                "Graph: Basic Terminologies and Representations, Graph search and traversal " +
                "algorithms and complexity analysis.\n\n\n" +
                "Suggested reference books:\n\n" +
                "1. Algorithms, Data Structures, and Problem Solving with C++”, Illustrated " +
                "Edition by Mark Allen Weiss, Addison-Wesley Publishing Company.\n" +
                "2. “How to Solve it by Computer”, 2nd Impression by R.G. Dromey, Pearson " +
                "Education.\n" +
                "3. “Fundamentals of Data Structures”, Illustrated Edition by Ellis Horowitz, " +
                "Sartaj Sahni, Computer Science Press.\n\n\n"));
        creditsList.add(new Credits("OBJECT ORIENTED PROGRAMMING USING C++","L:3 T:0 P:4 Credits:5","","Module 1 \n\n" +
                "Introduction to C++ : Object Oriented Technology, Advantages of OOP, Input- output in C++, " +
                "Tokens, Keywords, Identifiers, Data Types C++, Derives data types. The void data type, Type " +
                "Modifiers, Typecasting, Constant, Operator, Precedence of Operators, Strings.\n\n" +
                "Module 2 \n\n" +
                "Control Structures and Functions: Decision making statements like if-else, Nested if-else, goto, " +
                "break, continue, switch case, Loop statement like for loop, nested for loop, while loop, do-while " +
                "loop. Parts of Function, User- defined Functions, Value- Returning Functions, void Functions, " +
                "Value Parameters, Function overloading, Virtual Functions.\n\n" +
                "Module 3 \n\n" +
                "Classes and Data Abstraction : Structure in C++, Class, Build- in Operations on Classes, " +
                "Assignment Operator and Classes, Class Scope, Reference parameters and Class Objects " +
                "(Variables), Member functions, Accessor and Mutator Functions, Constructors, default Constructor, " +
                "Destructors.\n\n" +
                "Module 4 \n\n" +
                "Overloading, Templates and Inheritance: Operator Overloading, Function Overloading, " +
                "Function Templates, Class Templates. Single and Multiple Inheritance, virtual Base class, Abstract " +
                "Class, Pointer and Inheritance, Overloading Member Function.\n\n" +
                "Module 5 \n\n" +
                "Pointers, Arrays and Exception Handling: Void Pointers, Pointer to Class, Pointer to Object, " +
                "Void Pointer, Arrays. The keywords try, throw and catch. Creating own Exception Classes, " +
                "Exception Handling Techniques (Terminate the Program, Fix the Error and Continue, Log the Error " +
                "and Continue), Stack Unwinding.\n\n\n" +
                "Suggested books:\n\n" +
                "1. Thinking in C++, Volume 1 & 2 by Bruce Eckel, Chuck Allison, Pearson Education\n" +
                "2. Mastering C++, 1/e by Venugopal, Tata McGraw Hill.\n" +
                "3. Object Oriented Programming with C++, 3/e by E. Balaguruswamy, Tata McGraw Hill.\n" +
                "4. Starting Out with Object Oriented Programming in C++, by Tony Gaddis, Wiley India.\n\n\n"));
        creditsList.add(new Credits("TECHNICAL WRITING","L:3 T:0 P:0 Credits:3","","Module 1 \n\n" +
                "Introduction: Fundamentals of Technical Writing: Need for Clear and Concise Technical " +
                "Writing, Attributes of Technical Writing, Types of Technical Writing, Benefits of Technical " +
                "Writing, Technical, Managerial and General Readers, Expressing versus Impressing, Correct use " +
                "of Noun, Pronoun, Verb, Adjective, Adverbs, Tense and Punctuation.\n\n" +
                "Module 2 \n\n" +
                "Performing Technical Studies: Types of Technical Studies, General Methodology- Proposing " +
                "a Project, Gathering Background Information, Designing Test Plans, Performing Experiments, " +
                "Reporting Results. Writing Strategy: Analysis of Readers, Scope of Writing, Purpose and " +
                "Objective. Document Options: Document Hierarchy, Report Types and Selection. Criteria for " +
                "Good Technical Writing: Technical Content, Presentation, Language Skills. Writing Style:" +
                "Elements of Style, Examples of Writing Styles, Recommended Style, Learn to Prepare Effective " +
                "Illustrations \n\n" +
                "Module 3 \n\n" +
                "Formal Reports: The Outline and Introduction (Outline, Title, Front Matter, Writing the " +
                "Introduction), Writing the Body (Writing a Procedure, Describing Machines/Processes, Writing " +
                "Test Results, Writing the Discussion Section), Closure (Conclusions, Recommendations, " +
                "References, Abstract, Back Matter, Report Distribution, Saving Reports). Informal Reports: " +
                "Elements of an Informal Report, Investigation Reports, Service Work, Action Letters and " +
                "Proposals. Typical Memo Reports. \n\n" +
                "Module 4 \n\n" +
                "Review and Editing: Types of Review and Edit, Review and Editing Methodology, Examples " +
                "of Reviews. Oral Presentations: Types of Oral Presentations, Preparation, Visual Aids, " +
                "Impediments to Technical Writing, Maintaining Writing Skills, Measuring Report Results. \n\n\n" +
                "Suggested books:\n" +
                "1. “Engineers’ Guide to Technical Writing”, Kenneth G. Budinski, ASM " +
                "International.\n" +
                "2. “Handbook for Technical Writing”, James H. Shelton, NTC Contemporary Press \n" +
                "3. “The Technical Writer's Handbook: Writing With Style and Clarity”, Matt Young, " +
                "University Science Books\n\n\n"));
        creditsList.add(new Credits("MATHEMATICS -III (DIFFERENTIAL CALCULUS)","L:2 T:0 P:0 Credits:2","","Module 1 \n\n" +
                "Successive Differentiation, Leibnitz’s Theorem. Limit, Continuity and Differentiability of function " +
                "for one variable.\n\n" +
                "Module 2 \n\n" +
                "Limit, Continuity and Differentiability of function for several variables. Partial Derivatives, Euler’s " +
                "Theorem for Homogeneous functions, Total derivatives, Change of Variables. Maxima and Minima " +
                "of Several Variables. Methods of Lagrange Multipliers. Taylor’s and Maclaurin’s Theorem with " +
                "remainders of several variables. \n\n" +
                "Module 3 \n\n" +
                "Vector Calculus: Gradient, Divergence and Curl of a Vector and their Physical Interpretations, " +
                "Vector Identities. Directional Derivatives. Line, Surface and Volume integrals, Application of " +
                "Green’s, Stokes and Gauss Divergence Theorem (Without Proof). \n\n" +
                "Module 4 \n\n" +
                "First Order Ordinary Differential Equations: Exact, Linear and Bernoulli’s Equations, Euler’s " +
                "Equations, Equations not of First Degree: Equations Solvable for P, Equations Solvable for Y, " +
                "Equations Solvable for X and Clairaut’s Type. \n\n" +
                "Module 5 \n\n" +
                "Ordinary Differential Equations of Higher Orders: Second Order Linear Differential Equations " +
                "with Variable Coefficients, Method of Variation of Parameters, Cauchy-Euler Equation; Power " +
                "Series Solutions; Legendre Polynomials, Bessel Functions of the First Kind and their properties.\n\n" +
                "Module 6 \n\n" +
                "Partial Differential Equations – First Order: First Order Partial Differential Equations, Solutions " +
                "of First Order Linear and Non-Linear PDEs.\n\n\n"));
    }
}