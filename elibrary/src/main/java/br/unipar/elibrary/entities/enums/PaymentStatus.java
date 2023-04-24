package br.unipar.elibrary.entities.enums;

public enum PaymentStatus {
	
	PENDING(1, "Pendente"),
	SETTLED(2, "Quitado"),
	CANCELED(3, "Cancelado");
	
	private Integer code;
	private String description;
	
	private PaymentStatus(Integer code, String description) {
		this.code = code;
		this.description = description;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public static PaymentStatus toEnum(Integer code) {
		if (code == null) {
			return null;
		}
		for (PaymentStatus status : PaymentStatus.values()) {
			if (status.getCode().equals(code)) {
				return status;
			}
		}
		
		throw new IllegalArgumentException("Código inválido! Código: " + code);
	}
}
