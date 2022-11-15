arr = [4, 3, 1, 5, 2]
# arr: 정렬할 값들이 들어있는 배열

for a in range(len(arr)-1):
    for i in range(len(arr)-a-1):
        # 오름차순 정렬이므로 왼쪽 값이 더 크면 서로 맞바꿈
        if arr[i] > arr[i+1]:
            swap = arr[i]
            arr[i] = arr[i+1]
            arr[i+1] = swap

for i in range(len(arr)):
    print(arr[i], end=' ')