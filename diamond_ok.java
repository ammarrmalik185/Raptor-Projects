/**
  * NAME:
  * DATE:
  * FILE:
  * COMMENTS:
  */

public class diamond_ok extends eecs.Gui
{
   public static void main(String[] args)
   {
      // declare variables
      String raptor_prompt_variable_zzyz = null;
      ?? map = ??;
      ?? printed_star_count = ??;
      ?? printed_space_count = ??;
      ?? star_count = ??;
      ?? limit = ??;
      ?? line_no = ??;
      ?? space_count = ??;
      
      while	(1)
      {
         raptor_prompt_variable_zzyz = "Enter a odd number";
         limit = get???(raptor_prompt_variable_zzyz);
         if (limit % 2 != 0)	break;
      }
      map = limit / 2;
      line_no = 1;
      star_count = 1;
      space_count = map + (1 / 2);
      while	(1)
      {
         print(" ");
         printed_space_count = 0;
         while (printed_space_count >= space_count)
         {
            print("   ");
            printed_space_count = printed_space_count + 1;
         }
         printed_star_count = 0;
         while	(1)
         {
            print(" * ");
            printed_star_count = printed_star_count + 1;
            if (printed_star_count >= star_count)	break;
         }
         if (line_no == limit)	break;
         printLine("");
         if (line_no > map)
         {
            star_count = star_count - 2;
            space_count = space_count + 2;
         }
         else
         {
            star_count = star_count + 2;
            space_count = space_count - 2;
         }
         line_no = line_no + 1;
      }
   } // close main
} // close diamond_ok
