package com.example.collegearena;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Csesem4Activity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Credits> creditsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csesem4);

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
        creditsList.add(new Credits("DISCRETE MATHEMATICS","L:3 T:1 P:0 Credits:4","","Module 1 \n\n" +
                "Sets, Relation and Function: Operations and Laws of Sets, Cartesian Products, Binary " +
                "Relation, Partial Ordering Relation, Equivalence Relation, Image of a Set, Sum and Product " +
                "of Functions, Bijective functions, Inverse and Composite Function, Size of a Set, Finite and " +
                "infinite Sets, Countable and uncountable Sets, Cantor's diagonal argument and The Power " +
                "Set theorem, Schroeder-Bernstein theorem.\n\n" +
                "Module 2 \n\n" +
                "Principles of Mathematical Induction: The Well-Ordering Principle, Recursive definition, " +
                "The Division algorithm: Prime Numbers, The Greatest Common Divisor: Euclidean Algorithm, " +
                "The Fundamental Theorem of Arithmetic." +
                "Basic counting techniques-inclusion and exclusion, pigeon-hole principle, permutation and " +
                "combination.\n\n" +
                "Module 3 \n\n" +
                "Propositional Logic: Syntax, Semantics, Validity and Satisfiability, Basic Connectives and " +
                "Truth Tables, Logical Equivalence: The Laws of Logic, Logical Implication, Rules of Inference, " +
                "The use of Quantifiers. Proof Techniques: Some Terminology, Proof Methods and Strategies, " +
                "Forward Proof, Proof by Contradiction, Proof by Contraposition, Proof of Necessity and " +
                "Sufficiency.\n\n" +
                "Module 4 \n\n" +
                "Algebraic Structures and Morphism: Algebraic Structures with one Binary Operation, Semi " +
                "Groups, Monoids, Groups, Congruence Relation and Quotient Structures, Free and Cyclic " +
                "Monoids and Groups, Permutation Groups, Substructures, Normal Subgroups, Algebraic " +
                "Structures with two Binary Operation, Rings, Integral Domain and Fields. Boolean Algebra " +
                "and Boolean Ring, Identities of Boolean Algebra, Duality, Representation of Boolean Function, " +
                "Disjunctive and Conjunctive Normal Form\n\n" +
                "Module 5 \n\n" +
                "Graphs and Trees: Graphs and their properties, Degree, Connectivity, Path, Cycle, Sub " +
                "Graph, Isomorphism, Eulerian and Hamiltonian Walks, Graph Coloring, Coloring maps and " +
                "Planar Graphs, Coloring Vertices, Coloring Edges, List Coloring, Perfect Graph, definition " +
                "properties and Example, rooted trees, trees and sorting, weighted trees and prefix codes, Biconnected component and Articulation Points, Shortest distances.\n\n\n" +
                "Suggested books:\n\n" +
                "1. Kenneth H. Rosen, Discrete Mathematics and its Applications, Tata McGraw –Hill\n" +
                "2. Susanna S. Epp, Discrete Mathematics with Applications, 4th edition, Wadsworth " +
                "Publishing Co.Inc.\n" +
                "3. C L Liu and D P Mohapatra, Elements of Discrete Mathematics A Computer Oriented " +
                "Approach, 3rd Edition by, Tata McGraw –Hill.\n\n\n"));
        creditsList.add(new Credits("COMPUTER ORGANISATION & ARCHITECTURE","L:3 T:0 P:4 Credits:5","","Module 1 \n\n" +
                "Functional blocks of a computer: CPU, memory, input-output subsystems, control unit. " +
                "Instruction set architecture of a CPU–registers, instruction execution cycle, RTL interpretation of " +
                "instructions, addressing modes, instruction set. Case study – instruction sets of some common " +
                "CPUs." +
                "Data representation: signed number representation, fixed and floating point representations, " +
                "character representation. Computer arithmetic – integer addition and subtraction, ripple carry adder, " +
                "carry look-ahead adder, etc. multiplication – shift-and-add, Booth multiplier, carry save multiplier, " +
                "etc. Division restoring and non-restoring techniques, floating point arithmetic.\n\n" +
                "Module 2 \n\n" +
                "Introduction to x86 architecture. CPU control unit design: hardwired and micro- programmed " +
                "design approaches, Case study – design of a simple hypothetical CPU. Memory system design: " +
                "semiconductor memory technologies, memory organization. \n" +
                "Peripheral devices and their characteristics: Input-output subsystems, I/O device interface, " +
                "I/O transfers–program controlled, interrupt driven and DMA, privileged and non-privileged " +
                "instructions, software interrupts and exceptions. Programs and processes–role of interrupts in " +
                "process state transitions, I/O device interfaces – SCII, USB.\n\n" +
                "Module 3 \n\n" +
                "Pipelining: Basic concepts of pipelining, throughput and speedup, pipeline hazards." +
                "Parallel Processors: Introduction to parallel processors, Concurrent access to memory and cache " +
                "coherency.\n\n" +
                "Module 4 \n\n" +
                "Memory organization: Memory interleaving, concept of hierarchical memory organization, cache " +
                "memory, cache size vs. Block size, mapping functions, replacement algorithms, write policies.\n\n\n"+

                "Suggested reference books"+
            "1. “Computer Organization and Design: The Hardware/Software Interface”, 5th Edition by David " +
                "A. Patterson and John L. Hennessy, Elsevier.\n" +
                "2. “Computer Organization and Embedded Systems”, 6th Edition by Carl Hamacher, McGraw Hill " +
                "Higher Education."));
        creditsList.add(new Credits("OPERATING SYSTEMS","L:3 T:0 P:4 Credits:5","","Module 1 \n\n" +
                "Introduction: Concept of Operating Systems, Generations of Operating systems, Types of " +
                "Operating Systems, OS Services, System Calls, Structure of an OS-Layered, Monolithic, " +
                "Microkernel Operating Systems, Concept of Virtual Machine. Case study on UNIX and WINDOWS " +
                "PCC CS 402P Computer Organization & Architecture Lab" +
                "Operating System.\n\n" +
                "Module 2 \n\n" +
                "Processes: Definition, Process Relationship, Different states of a Process, Process State transitions, " +
                "Process Control Block (PCB), Context switching." +
                "Thread: Definition, Various states, Benefits of threads, Types of threads, Concept of multithreads" +
                "Process Scheduling: Foundation and Scheduling objectives, Types of Schedulers, Scheduling criteria: " +
                "CPU utilization, Throughput, Turnaround Time, Waiting Time, Response Time; Scheduling " +
                "algorithms: Pre-emptive and Non pre-emptive, FCFS, SJF, RR; Multiprocessor scheduling: Real Time " +
                "scheduling: RM and EDF.\n\n" +
                "Module 3 \n\n" +
                "Inter-process Communication: Critical Section, Race Conditions, Mutual Exclusion, Hardware" +
                "Solution, Strict Alternation, Peterson’s Solution, The Producer - Consumer Problem, Semaphores, " +
                "Event Counters, Monitors, Message Passing, Shared Memory, Classical IPC Problems: Reader’s & " +
                "Writer Problem, Dinning Philosopher Problem etc.\n\n" +
                "Module 4 \n\n" +
                "Deadlocks: Definition, Necessary and sufficient conditions for Deadlock, " +
                "Deadlock Prevention, and Deadlock Avoidance: Banker’s algorithm, Deadlock detection and " +
                "Recovery.\n\n" +
                "Module 5 \n\n" +
                "Memory Management: Basic concept, Logical and Physical address map, Memory allocation: " +
                "Contiguous Memory allocation – Fixed and variable partition–Internal and External fragmentation and " +
                "Compaction; Paging and Segmentation: Principle of operation – Page allocation – Hardware support " +
                "for paging, Protection and sharing, Advantages and Disadvantages of paging and segmentation." +
                "Virtual Memory: Basics of Virtual Memory – Hardware and control structures – Locality of " +
                "reference, Page fault , Working Set , Dirty page/Dirty bit – Demand paging, Page Replacement " +
                "algorithms: Optimal, First in First Out (FIFO), Second Chance (SC), Not recently used (NRU) and " +
                "Least Recently used (LRU).\n\n" +
                "Module 6 \n\n" +
                "File Management: Concept of File, Access methods, File types, File operation, Directory " +
                "structure, File System structure, Allocation methods (contiguous, linked, indexed), Free-space " +
                "management (bit vector, linked list, grouping), directory implementation (linear list, hash table), " +
                "efficiency and performance." +
                "Disk Management: Disk structure, Disk scheduling - FCFS, SSTF, SCAN, C-SCAN, Disk reliability, " +
                "Disk formatting, Boot-block, Bad blocks" +
                "I/O Hardware: I/O devices, Device controllers, Direct memory access, Principles of I/O Software: " +
                "Goals of Interrupt handlers, Device drivers, Device independent I/O software, Secondary-Storage " +
                "Structure.\n\n\n" +
                "Suggested books:\n\n" +
                "1. Operating System Concepts Essentials, 9th Edition by Avi Silberschatz, Peter Galvin, Greg Gagne, " +
                "Wiley Asia Student Edition.\n" +
                "2. Operating Systems: Internals and Design Principles, 5th Edition, William Stallings, Prentice Hall of " +
                "India.\n" +
                "3. Operating Systems: Design and Implementation 3rd Edition, 3rd Edition, Andrew S. Tanenbaum\n\n\n"));
        creditsList.add(new Credits("DESIGN AND ANALYSIS OF ALGORITHM","L:3 T:0 P:4 Credits:5","",
                "Module 1/n/n"+"ntroduction: Characteristics of algorithm. Analysis of algorithm: Asymptotic " +
                "analysis of complexity bounds – best, average and worst-case behavior; " +
                "Performance measurements of Algorithm, Time and space trade-offs, Analysis of " +
                "recursive algorithms through recurrence relations: Substitution method, Recursion " +
                "tree method and Masters’ theorem.\n\n" +
                "Module 2 \n\n" +
                "Introduction to Divide and Conquer paradigm: Binary Search, Quick and Merge " +
                "sorting techniques, linear time selection algorithm, Strassen’s Matrix Multiplication, " +
                "Karatsuba Algorithm for fast multiplication etc. Introduction to Heap: Min and Max" +
                "Heap, Build Heap, Heap Sort\n\n" +
                "Module 3 \n\n" +
                "Overview of Brute-Force, Greedy Programming, Dynamic Programming, Branch- andBound and Backtracking methodologies. Greedy paradigm examples of exact " +
                "optimization solution: Minimum Cost Spanning Tree, Knapsack problem, Job " +
                "Sequencing Problem, Huffman Coding, Single source shortest path problem." +
                "Dynamic Programming, difference between dynamic programming and divide and " +
                "conquer, Applications: Fibonacci Series, Matrix Chain Multiplication, 0-1 Knapsack " +
                "Problem, Longest Common Subsequence, Travelling Salesman Problem, Rod Cutting, " +
                "Bin Packing. " +
                "Heuristics – characteristics and their application domains." +
                "Module 4 \n\n" +
                "Graph and Tree Algorithms: Representational issues in graphs, Traversal " +
                "algorithms: Depth First Search (DFS) and Breadth First Search (BFS); Shortest " +
                "path algorithms: Bellman-Ford algorithm, Dijkstra’s algorithm & Analysis of " +
                "Dijkstra’s algorithm using heaps, Floyd-Warshall’s all pairs shortest path algorithm." +
                "Transitive closure, Topological sorting, Network Flow Algorithm, Connected " +
                "Component\n\n" +
                "Module 5 \n\n" +
                "Tractable and Intractable Problems: Computability of Algorithms, Computability " +
                "classes – P, NP, NP-complete and NP-hard. Cook’s theorem, Standard NP-complete " +
                "problems and Reduction techniques." +
                "Approximation algorithms, Randomized algorithms\n\n\n" +
                "Suggested books:\n\n" +
                "1. Introduction to Algorithms, 4th Edition, Thomas H Cormen, Charles E " +
                "Lieserson, Ronald L Rivest and Clifford Stein, MITPress/McGraw-Hill.\n" +
                "2. Horowitz & Sahani, \"Fundamental of Computer Algorithm\", Galgotia.\n" +
                "3. Basse, \"Computer Algorithms: Introduction to Design & Analysis\", Addision Wesley.\n\n\n"));
        creditsList.add(new Credits("DIGITAL ELECTRONICS","L:3 T:0 P:4 Credits:5","","Module 1 \n\n" +
                "Fundamentals of Digital Systems and logic families: Digital signals, digital circuits, AND, OR, " +
                "NOT, NAND, NOR and Exclusive-OR operations, Boolean algebra, examples of IC gates, number " +
                "systems-binary, signed binary, octal hexadecimal number, binary arithmetic, one’s and two’s " +
                "complements arithmetic, codes, error detecting and correcting codes, characteristics of digital lCs, " +
                "digital logic families, TTL, Schottky TTL and CMOS logic, interfacing CMOS and TTL, Tri - state " +
                "logic. \n\n" +
                "Module 2 \n\n" +
                "Combinational Digital Circuits: Standard representation for logic functions K-map representation, " +
                "simplification of logic functions using K-map, minimization of logical functions. Don’t care " +
                "conditions, Multiplexer, DeMultiplexer/Decoders, Adders, Subtractors, BCD arithmetic, carry look " +
                "ahead adder, serial adder, ALU, elementary ALU design, popular MSI chips, digital comparator, parity " +
                "checker/generator, code converters, priority encoders, decoders/drivers for display devices, Q-M " +
                "method of function realization.\n\n" +
                "Module 3 \n\n" +
                "Sequential circuits and systems: A 1-bit memory, the circuit properties of Bistable latch, the " +
                "clocked SR flip flop, J- K-T and D types flip flops, applications of flip flops, shift registers, " +
                "applications of shift registers, serial to parallel converter, parallel to serial converter, ring counter, " +
                "sequence generator, ripple (Asynchronous) counters, synchronous counters, counters design using " +
                "flip flops, special counter IC’s, asynchronous sequential counters, applications of counters.\n\n" +
                "Module 4 \n\n" +
                "A/D and D/A Converters: Digital to analog converters: weighted resistor/converter, R-2RLadder D/A " +
                "converter, specifications for D/A converters, examples of D/A converter lCs, sample and hold " +
                "circuit, analog to digital converters: quantization and encoding, parallel comparator A/D converter, " +
                "successive approximation A/D converter, counting A/D converter, dual slope A/D converter, " +
                "A/D converter using " +
                "Voltage to frequency and voltage to time conversion, specifications of A/D converters, example of A/D " +
                "converter ICs. \n\n" +
                "Module 5 \n\n" +
                "Semiconductor memories and Programmable logic devices: Memory organization and operation, " +
                "expanding memory size, classification and characteristics of memories, sequential memory, read only " +
                "memory (ROM), read and write memory(RAM), content addressable memory (CAM), charge de " +
                "coupled device memory (CCD), commonly used memory chips, ROM as a PLD, Programmable " +
                "logic array, Programmable array logic, complex Programmable logic devices (CPLDS), Field " +
                "Programmable Gate Array (FPGA). \n\n\n" +
                "Suggested books: \n\n" +
                "1. R. P. Jain, \"Modern Digital Electronics\", McGraw Hill Education, 2009. \n" +
                "2. M. M. Mano, \"Digital logic and Computer design\", Pearson Education India, 2016. \n" +
                "3. A. Kumar, \"Fundamentals of Digital Circuits\", Prentice Hall India, 2016. \n\n\n"));
        creditsList.add(new Credits("HUMAN RESOURCE DEVELPOMENT AND ORGANIZATIONAL BEHAVIOUR","L:3 T:0 P:4 Credits:5","",
                "Module 1 \n\n" +
                        "Introduction: HR Role and Functions, Concept and Significance of HR, Changing role of HR " +
                        "managers - HR functions and Global Environment, role of a HR Manager. Human Resources " +
                        "Planning: HR Planning and Recruitment: Planning Process - planning at different levels - Job " +
                        "Analysis\n\n" +
                        "Module 2 \n\n" +
                        "Recruitment and selection processes - Restructuring strategies - Recruitment-Sources of " +
                        "Recruitment-Selection Process-Placement and Induction-Retention of Employees. Training and " +
                        "Development: need for skill upgradation - Assessment of training needs - Retraining and " +
                        "Redeployment methods and techniques of training employees and executives – performance appraisal " +
                        "systems.\n\n" +
                        "Module 3 \n\n" +
                        "Performance Management System: Definition, Concepts and Ethics-Different methods of " +
                        "Performance Appraisal- Rating Errors Competency management. Industrial Relations : Factors " +
                        "influencing industrial relations - State Interventions and Legal Framework - Role of Trade unions -" +
                        "Collective Bargaining - Workers; participation in management.\n\n" +
                        "Module 4 \n\n" +
                        "Organizational Behaviour: Definition, Importance, Historical Background, Fundamental Concepts of " +
                        "OB, Challenges and Opportunities for OB. Personality and Attitudes: Meaning of personality, " +
                        "Personality Determinants and Traits, Development of Personality, Types of Attitudes, Job Satisfaction.\n\n" +
                        "Module 5 \n\n" +
                        "Leadership: Definition, Importance, Theories of Leadership Styles. Organizational Politics: Definition, " +
                        "Factors contributing to Political Behavior. Conflict Management: Traditional vis-a-vis Modern View " +
                        "of Conflict, Functional and Dysfunctional Conflict, Conflict Process, Negotiation - Bargaining " +
                        "Strategies, Negotiation Process.\n\n\n" +
                        "Suggested books: \n\n" +
                        "1. Gary Dessler, “Human Resource Management” - (8th ed.,) Pearson Education, Delhi.\n" +
                        "2. Robbins, S. P., Judge & T. A., “Organizational Behavior”, Pearson Education, 15th Edn\n\n\n"));
        creditsList.add(new Credits("ENVIRONMENTAL SCIENCE","L:3 T:0 P:0 Credits:0","","We as human being are not an entity separate from the environment around us rather we are " +
                "a constituent seamlessly integrated and co-exist with the environment around us. We are not an entity " +
                "so separate from the environment that we can think of mastering and controlling it rather we " +
                "must understand that each and every action of ours reflects on the environment and vice versa. Ancient " +
                "wisdom drawn from Vedas about environment and its sustenance reflects these ethos. There is a direct " +
                "application of this wisdom even in modern times. Idea of an activity based course on environment " +
                "protection is to sensitize the students " +
                "on the above issues through following two type of activities:\n\n" +
                "(a) Awareness Activities:\n\n" +
                "i) Small group meetings about water management, promotion of recycle use, generation of less " +
                "waste, avoiding electricity waste\n" +
                "ii) Slogan making events\n" +
                "iii) Poster making events\n" +
                "iv) Cycle rally\n" +
                "v) Lectures from experts\n\n" +
                "(b) Actual Activities:\n\n" +
                "i) Plantation\n" +
                "ii) Gifting a tree to see its full growth\n" +
                "iii) Cleanliness drive\n" +
                "iv) Drive for segregation of waste\n" +
                "v) To live some big environmentalist for a week or so to understand his work\n" +
                "vi) To work in kitchen garden for mess\n" +
                "vii) To know about the different varieties of plants\n" +
                "viii) Shutting down the fans and ACs of the campus for an hour or so\n\n\n"));
    }
}