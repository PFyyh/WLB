# 数组，栈，队列
## 数组
### 特点
- 相同类型，大小固定且连续的。
- 随机访问。
### 时间复杂度分析小结

1. 随机访问 -> O(1)
2. 根据索引修改 -> O(1)
3. 遍历数组 -> O(N)
4. 插入数值到数组 -> O(N)
   数组后移。
5. 插入数值到数组最后 -> O(1)

  只需要追加到最后一位。
7. 从数组删除数值 -> O(N)

   数组前移。
8. 从数组最后删除数值 -> O(1)

   只需要删除最后一位即可。