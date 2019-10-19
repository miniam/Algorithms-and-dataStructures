namespace Recursion
{
    public static class Found
    {
        public static bool IsFound(string str, char chr)
        {
            if (str == null || str.Length == 0)
                return false;
            if (str[0] == chr)
                return true;
            return IsFound(str.Substring(1), chr);
        }

        public static bool IsFound<T>(T[] arr, T item)
        {
            return IsFound(arr, item, 0);
        }

        private static bool IsFound<T>(T[] arr, T item, int index)
        {
            if (arr == null || index < 0 || index >= arr.Length)
                return false;
            if (arr[index].Equals(item))
                return true;
            return IsFound(arr, item, index + 1);
        }
    }
