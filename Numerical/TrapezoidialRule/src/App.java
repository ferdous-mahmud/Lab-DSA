class App
{
    public static void main (String[] args)
    {
        // Range of definite integral
        float x0 = 0;
        float xn = 1;
        int n = 6;
     
        System.out.println("Intregal Value is: "+Math.round(trapezoidal(x0, xn, n)* 10000.0) / 10000.0);
    }

    static float trapezoidal(float a, float b, float n)
    {
        // Grid spacing
        float h = (b - a) / n;

        float s = f(a) + f(b);
     
        for (int i = 1; i < n; i++)
        {
            s += 2 * f( a + i * h);
        }
        return (h / 2) * s;
    }

    static float f(float x)
    {
        // f(x) = 1/(1+x*x)
        return 1 / (1 + x * x);
    }
}