/*Write a program in which thread sleep for 6 sec in the loop in reverse order from 100
to 1 and change the name of thread.

 */
class SleepThread extends  Thread
{
    public void run()
    {
        for(int i=100; i>=1; i--)
        {
            System.out.println(i);
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

public class S2Ass2A2 {
    public static void main(String[] args) {
        SleepThread t = new SleepThread();
        t.start();
        System.out.println("Thread default name is:"+t.getName());
        t.setName("swapnilThread");
        System.out.println("After changing Thread Name:"+t.getName());

        System.out.println("main Thread...");
    }
}

/*100
Thread default name is:Thread-0
After changing Thread Name:swapnilThread
main Thread...
99
98
97
96
95
94
93
92
91
90
89
88
87
86
85
84
83
82
81
80
79
78
77
76
75
74
73
72
71
70
69
68
67
66
65
64
63
62
61
60
59
58
57
56
55
54
53
52
51
50
49
48
47
46
45
44
43
42
41
40
39
38
37
36
35
34
33
32
31
30
29
28
27
26
25
24
23
22
21
20
19
18
17
16
15
14
13
12
11
10
9
8
7
6
5
4
3
2
1

Process finished with exit code 0


 */