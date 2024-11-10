package javaptit;

public void maxGiaTheoNXB() {
    Map<String, Optional<Sach>> maxGiaMap = a.stream()
        .collect(Collectors.groupingBy(
            Sach::getNhaXB,
            Collectors.maxBy(Comparator.comparingDouble(Sach::getGia))
        ));

    Map<String, Double> result = new HashMap<>();
    for (Map.Entry<String, Optional<Sach>> entry : maxGiaMap.entrySet()) {
        result.put(entry.getKey(), entry.getValue().get().getGia());
    }

    System.out.println(result);
}
