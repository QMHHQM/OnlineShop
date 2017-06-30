export default async(url = '', data = {}, type = "POST", method = "fetch") => {
	type = type.toUpperCase();

	if (type == 'GET') {
		let dataStr = '';
		Object.keys(data).forEach(key => {
			dataStr += key + '=' + data[key] + '&';
		})

		if (dataStr !== '') {
			dataStr = dataStr.substr(0, dataStr.lastIndexOf('&'));
			url = url + '?' + dataStr;
		}
	}

	if (window.fetch && method == 'fetch') {
		let requestConfig = {
			credentials: 'include',
			method: type,
			headers: {
				'Accept': 'application/json',
				'Content-Type': 'application/json'
			},
			mode: 'cors',
			cache: 'force-cache'
		}

		if (type == 'POST') {
			
		}
	}
}