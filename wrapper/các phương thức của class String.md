1. **`charAt(int index)`** - Trả về ký tự tại vị trí chỉ định trong chuỗi.
2. **`codePointAt(int index)`** - Trả về giá trị mã Unicode của ký tự tại vị trí chỉ định.
3. **`codePointBefore(int index)`** - Trả về giá trị mã Unicode của ký tự ngay trước vị trí chỉ định.
4. **`codePointCount(int beginIndex, int endIndex)`** - Trả về số lượng các điểm mã Unicode trong khoảng chỉ định.
5. **`compareTo(String anotherString)`** - So sánh hai chuỗi theo thứ tự từ điển.
6. **`compareToIgnoreCase(String str)`** - So sánh hai chuỗi mà không phân biệt hoa thường.
7. **`concat(String str)`** - Nối chuỗi chỉ định vào chuỗi hiện tại.
8. **`contains(CharSequence s)`** - Kiểm tra chuỗi hiện tại có chứa chuỗi con chỉ định hay không.
9. **`contentEquals(CharSequence cs)`** - Kiểm tra chuỗi hiện tại có bằng với chuỗi ký tự chỉ định hay không.
10. **`copyValueOf(char[] data)`** - Trả về một chuỗi được tạo từ một mảng ký tự.
11. **`copyValueOf(char[] data, int offset, int count)`** - Trả về một chuỗi được tạo từ một phần của mảng ký tự.
12. **`endsWith(String suffix)`** - Kiểm tra chuỗi hiện tại có kết thúc bằng chuỗi con chỉ định hay không.
13. **`equals(Object anObject)`** - So sánh chuỗi hiện tại với đối tượng chỉ định.
14. **`equalsIgnoreCase(String anotherString)`** - So sánh chuỗi hiện tại với chuỗi khác mà không phân biệt hoa thường.
15. **`getBytes()`** - Chuyển đổi chuỗi thành một mảng byte sử dụng bảng mã mặc định.
16. **`getBytes(Charset charset)`** - Chuyển đổi chuỗi thành một mảng byte sử dụng bảng mã chỉ định.
17. **`getBytes(String charsetName)`** - Chuyển đổi chuỗi thành một mảng byte sử dụng tên bảng mã chỉ định.
18. **`getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)`** - Sao chép một phần của chuỗi vào mảng ký tự chỉ định.
19. **`hashCode()`** - Trả về mã băm của chuỗi.
20. **`indexOf(int ch)`** - Tìm vị trí đầu tiên của ký tự chỉ định trong chuỗi.
21. **`indexOf(int ch, int fromIndex)`** - Tìm vị trí đầu tiên của ký tự chỉ định trong chuỗi, bắt đầu từ chỉ số chỉ định.
22. **`indexOf(String str)`** - Tìm vị trí đầu tiên của chuỗi con chỉ định trong chuỗi.
23. **`indexOf(String str, int fromIndex)`** - Tìm vị trí đầu tiên của chuỗi con chỉ định trong chuỗi, bắt đầu từ chỉ số chỉ định.
24. **`intern()`** - Trả về một chuỗi được "interned", nghĩa là chuỗi này sẽ nằm trong pool các chuỗi.
25. **`isEmpty()`** - Kiểm tra xem chuỗi có rỗng không.
26. **`lastIndexOf(int ch)`** - Tìm vị trí cuối cùng của ký tự chỉ định trong chuỗi.
27. **`lastIndexOf(int ch, int fromIndex)`** - Tìm vị trí cuối cùng của ký tự chỉ định trong chuỗi, bắt đầu từ chỉ số chỉ định.
28. **`lastIndexOf(String str)`** - Tìm vị trí cuối cùng của chuỗi con chỉ định trong chuỗi.
29. **`lastIndexOf(String str, int fromIndex)`** - Tìm vị trí cuối cùng của chuỗi con chỉ định trong chuỗi, bắt đầu từ chỉ số chỉ định.
30. **`length()`** - Trả về độ dài của chuỗi.
31. **`matches(String regex)`** - Kiểm tra xem chuỗi có khớp với biểu thức chính quy chỉ định hay không.
32. **`offsetByCodePoints(int index, int codePointOffset)`** - Trả về chỉ số mới sau khi di chuyển một khoảng cách số điểm mã Unicode từ vị trí chỉ định.
33. **`regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)`** - So sánh một phần của chuỗi với một phần của chuỗi khác, tùy chọn không phân biệt hoa thường.
34. **`regionMatches(int toffset, String other, int ooffset, int len)`** - So sánh một phần của chuỗi với một phần của chuỗi khác.
35. **`replace(char oldChar, char newChar)`** - Thay thế tất cả các ký tự cũ bằng ký tự mới.
36. **`replace(CharSequence target, CharSequence replacement)`** - Thay thế tất cả các chuỗi con chỉ định bằng chuỗi thay thế.
37. **`replaceAll(String regex, String replacement)`** - Thay thế tất cả các chuỗi con khớp với biểu thức chính quy bằng chuỗi thay thế.
38. **`replaceFirst(String regex, String replacement)`** - Thay thế chuỗi con đầu tiên khớp với biểu thức chính quy bằng chuỗi thay thế.
39. **`split(String regex)`** - Chia chuỗi thành một mảng chuỗi con dựa trên biểu thức chính quy.
40. **`split(String regex, int limit)`** - Chia chuỗi thành một mảng chuỗi con dựa trên biểu thức chính quy, giới hạn số lượng phần tử trong mảng.
41. **`startsWith(String prefix)`** - Kiểm tra xem chuỗi có bắt đầu bằng chuỗi con chỉ định hay không.
42. **`startsWith(String prefix, int toffset)`** - Kiểm tra xem chuỗi có bắt đầu bằng chuỗi con chỉ định tại vị trí chỉ định hay không.
43. **`substring(int beginIndex)`** - Trả về một phần của chuỗi từ vị trí chỉ định đến hết.
44. **`substring(int beginIndex, int endIndex)`** - Trả về một phần của chuỗi từ vị trí chỉ định đến vị trí kết thúc chỉ định.
45. **`toCharArray()`** - Chuyển đổi chuỗi thành mảng ký tự.
46. **`toLowerCase()`** - Chuyển đổi tất cả các ký tự trong chuỗi thành chữ thường.
47. **`toLowerCase(Locale locale)`** - Chuyển đổi tất cả các ký tự trong chuỗi thành chữ thường dựa trên Locale chỉ định.
48. **`toString()`** - Trả về chính chuỗi hiện tại.
49. **`toUpperCase()`** - Chuyển đổi tất cả các ký tự trong chuỗi thành chữ hoa.
50. **`toUpperCase(Locale locale)`** - Chuyển đổi tất cả các ký tự trong chuỗi thành chữ hoa dựa trên Locale chỉ định.
51. **`trim()`** - Loại bỏ các ký tự trắng ở đầu và cuối chuỗi.
52. **`valueOf(boolean b)`** - Trả về chuỗi đại diện của giá trị boolean chỉ định.
53. **`valueOf(char c)`** - Trả về chuỗi đại diện của ký tự chỉ định.
54. **`valueOf(char[] data)`** - Trả về chuỗi đại diện của mảng ký tự chỉ định.
55. **`valueOf(char[] data, int offset, int count)`** - Trả về chuỗi đại diện của một phần của mảng ký tự chỉ định.
56. **`valueOf(double d)`** - Trả về chuỗi đại diện của giá trị double chỉ định.
57. **`valueOf(float f)`** - Trả về chuỗi đại diện của giá trị float chỉ định.
58. **`valueOf(int i)`** - Trả về chuỗi đại diện của giá trị nguyên chỉ định.
59. **`valueOf(long l)`** - Trả về chuỗi đại diện của giá trị long chỉ định.
60. **`valueOf(Object obj)`** - Trả về chuỗi đại diện của đối tượng chỉ định. Nếu đối tượng là `null`, trả về chuỗi `"null"`.