namespace intToRoman
{
    class Map
    {
        public int val { get; set; }
        public string letter { get; set; }

        public Map(int v, string s)
        {
            val = v;
            letter = s;
        }
        public override string ToString()
        {
            return this.letter;
        }
    }

    class Program
    {

        static String intToRoman(int num) {

            string toReturn = "";


            List<Map> values = new List<Map>();

            values.Add(new Map(1000, "M"));
            values.Add(new Map(900, "CM"));
            values.Add(new Map(500, "D"));
            values.Add(new Map(400, "CD"));
            values.Add(new Map(100, "C"));
            values.Add(new Map(90, "XC"));
            values.Add(new Map(50, "L"));
            values.Add(new Map(40, "XL"));
            values.Add(new Map(10, "X"));
            values.Add(new Map(9, "IX"));
            values.Add(new Map(5, "V"));
            values.Add(new Map(4, "IV"));
            values.Add(new Map(1, "I"));

            foreach(Map value in values) { 
                int a = num / value.val;
                for (int i = 0; i < a; i++)
                {
                    toReturn += value.letter;
                }
                num = num - (value.val * a);
            }



            return toReturn;
        }
        static void Main(string[] args)
        {

            Console.WriteLine(intToRoman(2234));
            Console.WriteLine(intToRoman(1000));

            Console.ReadLine();
        }
    }
}
