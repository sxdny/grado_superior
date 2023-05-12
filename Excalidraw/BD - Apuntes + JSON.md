---

excalidraw-plugin: parsed
tags: [excalidraw]

---
==⚠  Switch to EXCALIDRAW VIEW in the MORE OPTIONS menu of this document. ⚠==


# Text Elements
example 1 ^3s6H45oR

VM Polo ^cbnGDyqu

- [ ] Child Seat
- [ ] GPS
- [ ] Roof rack ^1lhd7o8D

extras ^avbpc9SX

Toyota Auris ^N8y3cw0O

- [ ] GPS ^4mmBcXfn

BOOK ^N8cznEzt

Connection
to database ^9QsbIIUM

reservations ^FTR4gbph

reservations_number ^Z0wzyGRR

customer_id ^fRA3hGfQ

car_id ^xZLP2Hg6

date_in ^HwSU0dVA

date_out ^QjZXRli1

extras ^n07Hxdry

date_out ^JOZ6XKSv

date_in ^jiUL5H91

Check avalibility ^4SBp5nrF

HTML Form ^EHdkhdUS

- [ ] ... ^ynUtbtIh

Toyota Auris ^euo6UEfm

- [ ] ... ^mkvC9q7D

- [ ] ... ^K2u2UDfg

- [ ] ... ^qwkUSHYh

VW Polo ^oYefKhii

BOOK ^3vknpr7B

BOOK ^iaa1eKEW

$sql = "INSERT INTO reservations ..." ^EshXE5xW

$sql = "SELECT ..." ^HqQ8PDYt

// $sql = "INSERT INTO..." ^jH30e78m

JSON in MariaDb -> Save in a variable as a LONG VARCHAR ^1gV30wVk

// Save info into variables, before
INSERT INTO ^Tq4ECbjK

POST ^HgO63MI0

POST ^aTuZEtlw

$reservation_number (GENERATE IT)
$customer_id = FROM the $_SESSION variable
$car_id = $_POST['car_id'];
$date_in = $_POST['date_in'];
$date_out = $_POST['date_out'];
$extras_array = $_POST['extras'];

$extras_json = json_encode ($extras-array); ^YZeTBBvY

INSERT INTO reservations (reservation_number, customer_id, car_id, date_in, date_out, extras)
VALUES ('$reservation_number', '$customer_id', '$car_id', '$date_in', '$date_out', '$extras_json'); ^VVFp84cf

from json to ARRAY ^1sEnK5kc

$extras_json

$extras_array = json_decode($extras_json) ^neV0r74m

from ARRAY to json
(SQL can't save arrays) ^NYwqXhYh

APUNTES SQL + JSON ^nDIl9vLl

[ 
    {
        "name" : "Google",
        "numberEmployees" : 354,
        "ceo" : "John Smith"
    },

    {
        "name" : "Amazon",
        "numberEmployees" : 512,
        "ceo" : "Jeff Smith"
    }
] ^ePCHI0yi

PHP ^tfMbc1Xd

$companies = json_decode(companies_json);
echo $companies[0]['name']; ^k2ZZqBtY

$ = root (principio del documento JSON) ^wIt4g0te

SELECT JSON_EXTRACT(companies, '$[0].name')
FROM info; ^a1PaF707

SQL ^mNMefL72

JS ^tzxag6xQ

let companies = JSON.parse(companies_json);
console.log(companies[0].name); ^RUE4cMLs

Google ^oDYhybRj

Google ^M82reCfw

Google ^LMFu4Sdh

JSON File ^CL8gdyWI

Poner métodos JSON aqui. ^eF5C3RLD

JSON_METHODS ^ackBFKtI

%%
# Drawing
```json
{
	"type": "excalidraw",
	"version": 2,
	"source": "https://github.com/zsviczian/obsidian-excalidraw-plugin/releases/tag/1.8.26",
	"elements": [
		{
			"type": "text",
			"version": 12,
			"versionNonce": 844782747,
			"isDeleted": false,
			"id": "3s6H45oR",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -316.4738464355469,
			"y": -198.00739288330078,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 89.65992736816406,
			"height": 25,
			"seed": 1773113801,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460108,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "example 1",
			"rawText": "example 1",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "example 1",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "rectangle",
			"version": 38,
			"versionNonce": 2088472213,
			"isDeleted": false,
			"id": "FqywXyxkXa_4_PKwfS6p-",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -306.4322204589844,
			"y": -141.4094009399414,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 157.9266357421875,
			"height": 143.32070922851562,
			"seed": 1237575433,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1683136460109,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 22,
			"versionNonce": 1169822011,
			"isDeleted": false,
			"id": "cbnGDyqu",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -106.51351928710938,
			"y": -128.62921905517578,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 76.29994201660156,
			"height": 25,
			"seed": 2836169,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460109,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "VM Polo",
			"rawText": "VM Polo",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "VM Polo",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "text",
			"version": 73,
			"versionNonce": 395768821,
			"isDeleted": false,
			"id": "1lhd7o8D",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -107.42642211914062,
			"y": -91.2015151977539,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 159.5598907470703,
			"height": 75,
			"seed": 276752457,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460109,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "- [ ] Child Seat\n- [ ] GPS\n- [ ] Roof rack",
			"rawText": "- [ ] Child Seat\n- [ ] GPS\n- [ ] Roof rack",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "- [ ] Child Seat\n- [ ] GPS\n- [ ] Roof rack",
			"lineHeight": 1.25,
			"baseline": 67
		},
		{
			"type": "freedraw",
			"version": 84,
			"versionNonce": 142225883,
			"isDeleted": false,
			"id": "ts0oJyuJVzC9piubxS4uP",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 90.66665649414062,
			"y": -147.79950714111328,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 53.859375,
			"height": 166.14251708984375,
			"seed": 1421719209,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460109,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					0.912841796875,
					0
				],
				[
					6.3900146484375,
					0
				],
				[
					11.8673095703125,
					0.912872314453125
				],
				[
					16.431640625,
					2.738616943359375
				],
				[
					20.0831298828125,
					4.564361572265625
				],
				[
					21.9088134765625,
					5.47723388671875
				],
				[
					22.8216552734375,
					8.215850830078125
				],
				[
					23.734619140625,
					11.867340087890625
				],
				[
					23.734619140625,
					13.69305419921875
				],
				[
					23.734619140625,
					18.257415771484375
				],
				[
					23.734619140625,
					20.99603271484375
				],
				[
					23.734619140625,
					23.734649658203125
				],
				[
					23.734619140625,
					26.4732666015625
				],
				[
					22.8216552734375,
					30.124755859375
				],
				[
					21.9088134765625,
					33.776214599609375
				],
				[
					18.25732421875,
					39.253448486328125
				],
				[
					18.25732421875,
					43.81781005859375
				],
				[
					16.431640625,
					47.46929931640625
				],
				[
					11.8673095703125,
					54.772247314453125
				],
				[
					10.954345703125,
					58.423736572265625
				],
				[
					10.954345703125,
					61.162353515625
				],
				[
					10.954345703125,
					63.900970458984375
				],
				[
					10.954345703125,
					64.8138427734375
				],
				[
					10.954345703125,
					67.55245971679688
				],
				[
					10.954345703125,
					68.46533203125
				],
				[
					10.04150390625,
					71.20394897460938
				],
				[
					10.04150390625,
					73.94253540039062
				],
				[
					10.04150390625,
					76.68115234375
				],
				[
					10.04150390625,
					78.50689697265625
				],
				[
					10.04150390625,
					80.3326416015625
				],
				[
					10.954345703125,
					82.15838623046875
				],
				[
					12.7801513671875,
					83.07125854492188
				],
				[
					13.6929931640625,
					84.89700317382812
				],
				[
					14.6058349609375,
					85.80987548828125
				],
				[
					16.431640625,
					86.72274780273438
				],
				[
					19.1702880859375,
					86.72274780273438
				],
				[
					20.9959716796875,
					86.72274780273438
				],
				[
					23.734619140625,
					87.6356201171875
				],
				[
					24.6474609375,
					88.54849243164062
				],
				[
					22.8216552734375,
					90.37423706054688
				],
				[
					22.8216552734375,
					91.287109375
				],
				[
					22.8216552734375,
					93.11282348632812
				],
				[
					21.9088134765625,
					94.02569580078125
				],
				[
					21.9088134765625,
					96.76431274414062
				],
				[
					20.9959716796875,
					98.59005737304688
				],
				[
					20.9959716796875,
					101.32867431640625
				],
				[
					20.0831298828125,
					103.1544189453125
				],
				[
					20.0831298828125,
					104.98016357421875
				],
				[
					19.1702880859375,
					107.71878051757812
				],
				[
					19.1702880859375,
					109.54452514648438
				],
				[
					19.1702880859375,
					112.28311157226562
				],
				[
					19.1702880859375,
					116.84747314453125
				],
				[
					19.1702880859375,
					119.58609008789062
				],
				[
					19.1702880859375,
					122.32470703125
				],
				[
					19.1702880859375,
					125.9761962890625
				],
				[
					19.1702880859375,
					128.71481323242188
				],
				[
					19.1702880859375,
					132.36627197265625
				],
				[
					17.344482421875,
					136.01776123046875
				],
				[
					16.431640625,
					140.58212280273438
				],
				[
					16.431640625,
					143.32073974609375
				],
				[
					15.518798828125,
					146.97222900390625
				],
				[
					13.6929931640625,
					150.62368774414062
				],
				[
					12.7801513671875,
					155.18804931640625
				],
				[
					10.954345703125,
					157.92666625976562
				],
				[
					9.128662109375,
					160.665283203125
				],
				[
					6.3900146484375,
					162.49102783203125
				],
				[
					3.6513671875,
					164.3167724609375
				],
				[
					-1.8258056640625,
					166.14251708984375
				],
				[
					-2.7386474609375,
					166.14251708984375
				],
				[
					-7.302978515625,
					166.14251708984375
				],
				[
					-11.867431640625,
					166.14251708984375
				],
				[
					-16.4317626953125,
					166.14251708984375
				],
				[
					-20.99609375,
					166.14251708984375
				],
				[
					-22.82177734375,
					166.14251708984375
				],
				[
					-23.7347412109375,
					166.14251708984375
				],
				[
					-25.5604248046875,
					166.14251708984375
				],
				[
					-27.38623046875,
					166.14251708984375
				],
				[
					-28.299072265625,
					166.14251708984375
				],
				[
					-29.2119140625,
					166.14251708984375
				],
				[
					-29.2119140625,
					166.14251708984375
				]
			],
			"lastCommittedPoint": null,
			"simulatePressure": true,
			"pressures": []
		},
		{
			"type": "text",
			"version": 23,
			"versionNonce": 2027859285,
			"isDeleted": false,
			"id": "avbpc9SX",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 138.13589477539062,
			"y": -80.2470474243164,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 66.27993774414062,
			"height": 25,
			"seed": 238075017,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460109,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "extras",
			"rawText": "extras",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "extras",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "rectangle",
			"version": 104,
			"versionNonce": 195903099,
			"isDeleted": false,
			"id": "heQiQZ4NyqrLorWV-Fxfu",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -308.1024627685547,
			"y": 57.43334197998047,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 157.9266357421875,
			"height": 143.32070922851562,
			"seed": 1237575433,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1683136460109,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 100,
			"versionNonce": 1067989685,
			"isDeleted": false,
			"id": "N8y3cw0O",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -108.18376159667969,
			"y": 70.2135238647461,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 130.5798797607422,
			"height": 25,
			"seed": 2836169,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460109,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "Toyota Auris",
			"rawText": "Toyota Auris",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Toyota Auris",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "text",
			"version": 146,
			"versionNonce": 437630747,
			"isDeleted": false,
			"id": "4mmBcXfn",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -109.09666442871094,
			"y": 107.64122772216797,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 99.199951171875,
			"height": 25,
			"seed": 276752457,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460109,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "- [ ] GPS",
			"rawText": "- [ ] GPS",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "- [ ] GPS",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "rectangle",
			"version": 33,
			"versionNonce": 77143061,
			"isDeleted": false,
			"id": "oYLgVqAUAYxDKzbfnSIre",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -178.94717407226562,
			"y": 245.18450164794922,
			"strokeColor": "#2b8a3e",
			"backgroundColor": "transparent",
			"width": 133,
			"height": 43,
			"seed": 229374197,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"type": "text",
					"id": "3vknpr7B"
				}
			],
			"updated": 1683136460109,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 19,
			"versionNonce": 36051899,
			"isDeleted": false,
			"id": "3vknpr7B",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -140.36715698242188,
			"y": 254.18450164794922,
			"strokeColor": "#2b8a3e",
			"backgroundColor": "transparent",
			"width": 55.8399658203125,
			"height": 25,
			"seed": 1342902869,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460109,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "BOOK",
			"rawText": "BOOK",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "oYLgVqAUAYxDKzbfnSIre",
			"originalText": "BOOK",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "freedraw",
			"version": 63,
			"versionNonce": 799461749,
			"isDeleted": false,
			"id": "Ive4cG8EvyXM6X4QR-G7p",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 88.84085083007812,
			"y": 335.6062545776367,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 84.89697265625,
			"height": 194.44146728515625,
			"seed": 1987385321,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460110,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					0,
					-0.912841796875
				],
				[
					3.6514892578125,
					-9.12872314453125
				],
				[
					10.9544677734375,
					-19.1702880859375
				],
				[
					17.3446044921875,
					-30.12469482421875
				],
				[
					22.82177734375,
					-41.9920654296875
				],
				[
					24.6474609375,
					-48.38214111328125
				],
				[
					24.6474609375,
					-57.5108642578125
				],
				[
					22.82177734375,
					-67.55242919921875
				],
				[
					20.0831298828125,
					-78.50689697265625
				],
				[
					15.518798828125,
					-94.93853759765625
				],
				[
					9.128662109375,
					-106.805908203125
				],
				[
					2.7386474609375,
					-116.84747314453125
				],
				[
					-1.82568359375,
					-125.06329345703125
				],
				[
					-8.2158203125,
					-133.27911376953125
				],
				[
					-12.7801513671875,
					-139.66925048828125
				],
				[
					-16.431640625,
					-146.97216796875
				],
				[
					-20.9959716796875,
					-153.3623046875
				],
				[
					-28.2989501953125,
					-161.578125
				],
				[
					-32.8634033203125,
					-166.1424560546875
				],
				[
					-35.6019287109375,
					-169.7939453125
				],
				[
					-37.427734375,
					-172.5325927734375
				],
				[
					-40.166259765625,
					-177.096923828125
				],
				[
					-43.8177490234375,
					-180.7484130859375
				],
				[
					-47.46923828125,
					-184.39990234375
				],
				[
					-51.1207275390625,
					-188.0513916015625
				],
				[
					-53.859375,
					-189.87713623046875
				],
				[
					-55.6851806640625,
					-190.78997802734375
				],
				[
					-55.6851806640625,
					-189.87713623046875
				],
				[
					-55.6851806640625,
					-180.7484130859375
				],
				[
					-55.6851806640625,
					-177.096923828125
				],
				[
					-55.6851806640625,
					-174.35833740234375
				],
				[
					-55.6851806640625,
					-172.5325927734375
				],
				[
					-55.6851806640625,
					-170.70684814453125
				],
				[
					-55.6851806640625,
					-166.1424560546875
				],
				[
					-54.772216796875,
					-164.3167724609375
				],
				[
					-54.772216796875,
					-162.49102783203125
				],
				[
					-55.6851806640625,
					-162.49102783203125
				],
				[
					-56.5980224609375,
					-164.3167724609375
				],
				[
					-56.5980224609375,
					-168.881103515625
				],
				[
					-56.5980224609375,
					-175.27117919921875
				],
				[
					-57.5108642578125,
					-178.92266845703125
				],
				[
					-58.4237060546875,
					-181.66131591796875
				],
				[
					-58.4237060546875,
					-182.57415771484375
				],
				[
					-58.4237060546875,
					-184.39990234375
				],
				[
					-59.3365478515625,
					-186.22564697265625
				],
				[
					-59.3365478515625,
					-188.0513916015625
				],
				[
					-59.3365478515625,
					-190.78997802734375
				],
				[
					-60.24951171875,
					-192.61572265625
				],
				[
					-60.24951171875,
					-193.52862548828125
				],
				[
					-59.3365478515625,
					-194.44146728515625
				],
				[
					-52.03369140625,
					-194.44146728515625
				],
				[
					-48.3822021484375,
					-194.44146728515625
				],
				[
					-46.556396484375,
					-194.44146728515625
				],
				[
					-44.730712890625,
					-194.44146728515625
				],
				[
					-43.8177490234375,
					-194.44146728515625
				],
				[
					-42.9049072265625,
					-194.44146728515625
				],
				[
					-41.9920654296875,
					-194.44146728515625
				],
				[
					-41.9920654296875,
					-194.44146728515625
				]
			],
			"lastCommittedPoint": null,
			"simulatePressure": true,
			"pressures": []
		},
		{
			"type": "freedraw",
			"version": 14,
			"versionNonce": 536931419,
			"isDeleted": false,
			"id": "NoIMJRwoA9JiDUaCKrS9x",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 41.371612548828125,
			"y": 255.27361297607422,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 0.912841796875,
			"height": 28.29901123046875,
			"seed": 1502472745,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460110,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					0,
					1.82574462890625
				],
				[
					0,
					8.21588134765625
				],
				[
					0,
					13.69305419921875
				],
				[
					0,
					18.2574462890625
				],
				[
					0,
					22.82177734375
				],
				[
					0,
					25.5604248046875
				],
				[
					0.912841796875,
					27.38616943359375
				],
				[
					0.912841796875,
					28.29901123046875
				],
				[
					0.912841796875,
					28.29901123046875
				]
			],
			"lastCommittedPoint": null,
			"simulatePressure": true,
			"pressures": []
		},
		{
			"type": "freedraw",
			"version": 13,
			"versionNonce": 236378837,
			"isDeleted": false,
			"id": "488mmEDJCr6Ge1dquBnu4",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 31.329986572265625,
			"y": 273.5310592651367,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 23.734619140625,
			"height": 2.7386474609375,
			"seed": 696940679,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460110,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					1.82568359375,
					0
				],
				[
					10.9544677734375,
					0
				],
				[
					15.518798828125,
					-0.91290283203125
				],
				[
					19.1702880859375,
					-2.7386474609375
				],
				[
					20.99609375,
					-2.7386474609375
				],
				[
					21.908935546875,
					-2.7386474609375
				],
				[
					23.734619140625,
					-2.7386474609375
				],
				[
					23.734619140625,
					-2.7386474609375
				]
			],
			"lastCommittedPoint": null,
			"simulatePressure": true,
			"pressures": []
		},
		{
			"type": "freedraw",
			"version": 63,
			"versionNonce": 662219003,
			"isDeleted": false,
			"id": "0h2THZqXlbwLYSnRDDlbS",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 53.238922119140625,
			"y": 336.51915740966797,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 93.11285400390625,
			"height": 37.427734375,
			"seed": 1739277351,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460110,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					-0.912841796875,
					0.912841796875
				],
				[
					-2.7386474609375,
					1.82574462890625
				],
				[
					-8.2158203125,
					4.5643310546875
				],
				[
					-14.60595703125,
					5.47723388671875
				],
				[
					-20.083251953125,
					5.47723388671875
				],
				[
					-28.299072265625,
					8.2158203125
				],
				[
					-35.60205078125,
					8.2158203125
				],
				[
					-43.81787109375,
					8.2158203125
				],
				[
					-51.12078857421875,
					8.2158203125
				],
				[
					-56.5980224609375,
					8.2158203125
				],
				[
					-58.42376708984375,
					8.2158203125
				],
				[
					-61.162353515625,
					8.2158203125
				],
				[
					-63.9010009765625,
					8.2158203125
				],
				[
					-68.46533203125,
					6.39007568359375
				],
				[
					-71.2039794921875,
					4.5643310546875
				],
				[
					-73.02972412109375,
					3.6514892578125
				],
				[
					-73.94256591796875,
					1.82574462890625
				],
				[
					-76.68121337890625,
					-0.91290283203125
				],
				[
					-78.5069580078125,
					-5.47723388671875
				],
				[
					-80.3326416015625,
					-8.21588134765625
				],
				[
					-81.24554443359375,
					-10.0416259765625
				],
				[
					-83.0712890625,
					-11.8673095703125
				],
				[
					-83.984130859375,
					-14.60595703125
				],
				[
					-84.89703369140625,
					-16.43170166015625
				],
				[
					-86.7227783203125,
					-18.2574462890625
				],
				[
					-87.6356201171875,
					-20.08319091796875
				],
				[
					-89.46136474609375,
					-22.82177734375
				],
				[
					-90.374267578125,
					-23.73468017578125
				],
				[
					-91.287109375,
					-25.5604248046875
				],
				[
					-91.287109375,
					-26.4732666015625
				],
				[
					-92.20001220703125,
					-26.4732666015625
				],
				[
					-92.20001220703125,
					-25.5604248046875
				],
				[
					-93.11285400390625,
					-23.73468017578125
				],
				[
					-93.11285400390625,
					-20.99603271484375
				],
				[
					-93.11285400390625,
					-19.1702880859375
				],
				[
					-93.11285400390625,
					-18.2574462890625
				],
				[
					-93.11285400390625,
					-17.34454345703125
				],
				[
					-93.11285400390625,
					-16.43170166015625
				],
				[
					-93.11285400390625,
					-14.60595703125
				],
				[
					-93.11285400390625,
					-12.78021240234375
				],
				[
					-93.11285400390625,
					-9.12872314453125
				],
				[
					-93.11285400390625,
					-10.0416259765625
				],
				[
					-93.11285400390625,
					-13.69305419921875
				],
				[
					-93.11285400390625,
					-17.34454345703125
				],
				[
					-93.11285400390625,
					-20.99603271484375
				],
				[
					-93.11285400390625,
					-22.82177734375
				],
				[
					-93.11285400390625,
					-23.73468017578125
				],
				[
					-93.11285400390625,
					-24.64752197265625
				],
				[
					-93.11285400390625,
					-25.5604248046875
				],
				[
					-93.11285400390625,
					-26.4732666015625
				],
				[
					-93.11285400390625,
					-27.38616943359375
				],
				[
					-93.11285400390625,
					-28.29901123046875
				],
				[
					-93.11285400390625,
					-29.2119140625
				],
				[
					-91.287109375,
					-29.2119140625
				],
				[
					-81.24554443359375,
					-29.2119140625
				],
				[
					-80.3326416015625,
					-29.2119140625
				],
				[
					-78.5069580078125,
					-28.29901123046875
				],
				[
					-78.5069580078125,
					-28.29901123046875
				]
			],
			"lastCommittedPoint": null,
			"simulatePressure": true,
			"pressures": []
		},
		{
			"type": "freedraw",
			"version": 41,
			"versionNonce": 679393333,
			"isDeleted": false,
			"id": "87PWeEfgUOFQisqwAV4Dh",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 94.31802368164062,
			"y": 359.4221725463867,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 166.142578125,
			"height": 86.72271728515625,
			"seed": 773518823,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460110,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					0,
					2.7386474609375
				],
				[
					0,
					5.47723388671875
				],
				[
					0.9129638671875,
					10.0416259765625
				],
				[
					4.564453125,
					13.69305419921875
				],
				[
					8.2159423828125,
					20.08319091796875
				],
				[
					12.7802734375,
					23.73468017578125
				],
				[
					15.5189208984375,
					27.38616943359375
				],
				[
					20.083251953125,
					31.03759765625
				],
				[
					26.4732666015625,
					34.6890869140625
				],
				[
					31.9505615234375,
					37.427734375
				],
				[
					37.427734375,
					40.16632080078125
				],
				[
					42.905029296875,
					41.9920654296875
				],
				[
					51.120849609375,
					45.6435546875
				],
				[
					59.336669921875,
					46.55645751953125
				],
				[
					67.552490234375,
					49.2950439453125
				],
				[
					75.768310546875,
					50.2078857421875
				],
				[
					87.6356201171875,
					50.2078857421875
				],
				[
					95.8514404296875,
					50.2078857421875
				],
				[
					104.0673828125,
					47.46929931640625
				],
				[
					111.370361328125,
					45.6435546875
				],
				[
					117.7603759765625,
					41.9920654296875
				],
				[
					125.9761962890625,
					35.60198974609375
				],
				[
					135.10498046875,
					27.38616943359375
				],
				[
					143.32080078125,
					17.34454345703125
				],
				[
					152.449462890625,
					8.21588134765625
				],
				[
					155.1881103515625,
					2.7386474609375
				],
				[
					157.9267578125,
					-3.6514892578125
				],
				[
					159.75244140625,
					-10.04156494140625
				],
				[
					159.75244140625,
					-14.60589599609375
				],
				[
					162.4910888671875,
					-20.99603271484375
				],
				[
					163.4039306640625,
					-25.56036376953125
				],
				[
					165.229736328125,
					-31.03759765625
				],
				[
					166.142578125,
					-33.77618408203125
				],
				[
					166.142578125,
					-35.6019287109375
				],
				[
					166.142578125,
					-36.51483154296875
				],
				[
					166.142578125,
					-36.51483154296875
				]
			],
			"lastCommittedPoint": null,
			"simulatePressure": true,
			"pressures": []
		},
		{
			"type": "freedraw",
			"version": 19,
			"versionNonce": 772788635,
			"isDeleted": false,
			"id": "R0CwzKcsyBCQ_kH6CAc7a",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 240.37747192382812,
			"y": 317.4301071166992,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 34.6890869140625,
			"height": 40.16632080078125,
			"seed": 1910594887,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460110,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					3.6514892578125,
					-0.912841796875
				],
				[
					12.7801513671875,
					-5.477203369140625
				],
				[
					20.9959716796875,
					-8.2158203125
				],
				[
					26.4732666015625,
					-11.8673095703125
				],
				[
					29.2117919921875,
					-12.780181884765625
				],
				[
					31.950439453125,
					-15.518798828125
				],
				[
					31.950439453125,
					-8.2158203125
				],
				[
					31.950439453125,
					-1.825714111328125
				],
				[
					31.03759765625,
					7.302978515625
				],
				[
					31.03759765625,
					13.69305419921875
				],
				[
					31.950439453125,
					20.99603271484375
				],
				[
					33.776123046875,
					22.82177734375
				],
				[
					34.6890869140625,
					24.64752197265625
				],
				[
					34.6890869140625,
					24.64752197265625
				]
			],
			"lastCommittedPoint": null,
			"simulatePressure": true,
			"pressures": []
		},
		{
			"type": "text",
			"version": 182,
			"versionNonce": 1489234325,
			"isDeleted": false,
			"id": "9QsbIIUM",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 196.42914254324774,
			"y": 180.32181331089566,
			"strokeColor": "#de7b12",
			"backgroundColor": "transparent",
			"width": 228.67193603515625,
			"height": 90,
			"seed": 1594393769,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460110,
			"link": null,
			"locked": false,
			"fontSize": 36,
			"fontFamily": 1,
			"text": "Connection\nto database",
			"rawText": "Connection\nto database",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Connection\nto database",
			"lineHeight": 1.25,
			"baseline": 76
		},
		{
			"type": "text",
			"version": 37,
			"versionNonce": 1962468923,
			"isDeleted": false,
			"id": "FTR4gbph",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 459.8141134161699,
			"y": 111.89737058940688,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"width": 217.25990295410156,
			"height": 45,
			"seed": 1251835847,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460110,
			"link": null,
			"locked": false,
			"fontSize": 36,
			"fontFamily": 1,
			"text": "reservations",
			"rawText": "reservations",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "reservations",
			"lineHeight": 1.25,
			"baseline": 31
		},
		{
			"type": "text",
			"version": 52,
			"versionNonce": 538701557,
			"isDeleted": false,
			"id": "Z0wzyGRR",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 462.096370496248,
			"y": 177.8106854087428,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 200.27980041503906,
			"height": 25,
			"seed": 211191687,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460110,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "reservations_number",
			"rawText": "reservations_number",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "reservations_number",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "text",
			"version": 53,
			"versionNonce": 1930847963,
			"isDeleted": false,
			"id": "fRA3hGfQ",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 709.7124898810137,
			"y": 175.2588055259303,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 119.119873046875,
			"height": 25,
			"seed": 1214845641,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460110,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "customer_id",
			"rawText": "customer_id",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "customer_id",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "text",
			"version": 75,
			"versionNonce": 1024215125,
			"isDeleted": false,
			"id": "xZLP2Hg6",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 885.1332509894121,
			"y": 172.76895262065688,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 64.25994873046875,
			"height": 25,
			"seed": 1214845641,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460110,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "car_id",
			"rawText": "car_id",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "car_id",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "text",
			"version": 93,
			"versionNonce": 519754619,
			"isDeleted": false,
			"id": "HwSU0dVA",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 989.6258199591387,
			"y": 172.12045408550063,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 77.19993591308594,
			"height": 25,
			"seed": 1214845641,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460110,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "date_in",
			"rawText": "date_in",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "date_in",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "text",
			"version": 99,
			"versionNonce": 23754165,
			"isDeleted": false,
			"id": "QjZXRli1",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1104.8386800665605,
			"y": 170.21203733745375,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 97.21990966796875,
			"height": 25,
			"seed": 1214845641,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460111,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "date_out",
			"rawText": "date_out",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "date_out",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "text",
			"version": 104,
			"versionNonce": 2028514331,
			"isDeleted": false,
			"id": "n07Hxdry",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1234.900325574373,
			"y": 167.81099058452406,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 66.27993774414062,
			"height": 25,
			"seed": 1214845641,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460111,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "extras",
			"rawText": "extras",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "extras",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "rectangle",
			"version": 37,
			"versionNonce": 1750857493,
			"isDeleted": false,
			"id": "YoG5re2c0pbDBgdNul5MR",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1220.9202230353105,
			"y": 159.55331541362563,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 92.42813110351562,
			"height": 41.07917785644531,
			"seed": 364350439,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1683136460111,
			"link": null,
			"locked": false
		},
		{
			"type": "line",
			"version": 45,
			"versionNonce": 1423077563,
			"isDeleted": false,
			"id": "4cBtRapYA2IWnE21wBWu_",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 463.3180109468616,
			"y": 213.5703151578594,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 208.65618024553578,
			"height": 3.912309919084805,
			"seed": 1548209961,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1683136460111,
			"link": null,
			"locked": false,
			"startBinding": null,
			"endBinding": null,
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": null,
			"points": [
				[
					0,
					0
				],
				[
					208.65618024553578,
					-3.912309919084805
				]
			]
		},
		{
			"type": "line",
			"version": 30,
			"versionNonce": 1817594997,
			"isDeleted": false,
			"id": "yfpacGuOx6F58OrbpUpqF",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 704.5767302548974,
			"y": 212.26621185149787,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 134.322509765625,
			"height": 2.6081630161829708,
			"seed": 415567591,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1683136460111,
			"link": null,
			"locked": false,
			"startBinding": null,
			"endBinding": null,
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": null,
			"points": [
				[
					0,
					0
				],
				[
					134.322509765625,
					2.6081630161829708
				]
			]
		},
		{
			"type": "line",
			"version": 28,
			"versionNonce": 1683661147,
			"isDeleted": false,
			"id": "PEi8R02S8J4sDyxQxutAY",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 876.7180179223081,
			"y": 209.6580052387746,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 99.11185128348234,
			"height": 2.6082066127231656,
			"seed": 878883271,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1683136460111,
			"link": null,
			"locked": false,
			"startBinding": null,
			"endBinding": null,
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": null,
			"points": [
				[
					0,
					0
				],
				[
					99.11185128348234,
					-2.6082066127231656
				]
			]
		},
		{
			"type": "line",
			"version": 34,
			"versionNonce": 488568277,
			"isDeleted": false,
			"id": "nVMZH4t4saTIGehaRH2N2",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 994.0872283017726,
			"y": 203.13748870696662,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 84.76649693080333,
			"height": 1.304103306361526,
			"seed": 1461591945,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1683136460111,
			"link": null,
			"locked": false,
			"startBinding": null,
			"endBinding": null,
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": null,
			"points": [
				[
					0,
					0
				],
				[
					84.76649693080333,
					1.304103306361526
				]
			]
		},
		{
			"type": "line",
			"version": 39,
			"versionNonce": 13876731,
			"isDeleted": false,
			"id": "dkascsmleh5qOMqKyVgFP",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1097.111258714719,
			"y": 201.83338540060498,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 110.84856305803578,
			"height": 1.3041033063616396,
			"seed": 1679084423,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1683136460111,
			"link": null,
			"locked": false,
			"startBinding": null,
			"endBinding": null,
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": null,
			"points": [
				[
					0,
					0
				],
				[
					110.84856305803578,
					1.3041033063616396
				]
			]
		},
		{
			"type": "rectangle",
			"version": 42,
			"versionNonce": 1976267573,
			"isDeleted": false,
			"id": "uVr_4lZzKOeCa79GKhu-P",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -622.7119507995153,
			"y": 448.7840953614019,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 450.72998046875,
			"height": 393.675537109375,
			"seed": 1589667701,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1683136460111,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 45,
			"versionNonce": 893404827,
			"isDeleted": false,
			"id": "jiUL5H91",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -582.7737488952184,
			"y": 487.3113170410894,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 77.19993591308594,
			"height": 25,
			"seed": 575882645,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460111,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "date_in",
			"rawText": "date_in",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "date_in",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "rectangle",
			"version": 51,
			"versionNonce": 1925268629,
			"isDeleted": false,
			"id": "TcFMuDLI1LooHQohvZkZt",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -578.2093873229528,
			"y": 524.0959468628668,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 352.5962829589844,
			"height": 36.51481628417969,
			"seed": 335343541,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1683136460111,
			"link": null,
			"locked": false
		},
		{
			"type": "rectangle",
			"version": 164,
			"versionNonce": 139639611,
			"isDeleted": false,
			"id": "iB-5zljXp2wHbZqTKtU2B",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -579.3505158629919,
			"y": 629.0760722901128,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 352.5962829589844,
			"height": 36.51481628417969,
			"seed": 765434011,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1683136460111,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 93,
			"versionNonce": 1739975157,
			"isDeleted": false,
			"id": "JOZ6XKSv",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -572.5039735045934,
			"y": 590.0092998291753,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 97.21990966796875,
			"height": 25,
			"seed": 1323893141,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460112,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "date_out",
			"rawText": "date_out",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "date_out",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "rectangle",
			"version": 65,
			"versionNonce": 107846619,
			"isDeleted": false,
			"id": "2s6tJroB65bYpkx2eE-YS",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -403.62290050654656,
			"y": 778.5586848999761,
			"strokeColor": "#2b8a3e",
			"backgroundColor": "transparent",
			"width": 188.27964782714844,
			"height": 38.79707336425781,
			"seed": 1701279061,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1683136460112,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 47,
			"versionNonce": 363782997,
			"isDeleted": false,
			"id": "4SBp5nrF",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -384.63966991572624,
			"y": 786.3882747437261,
			"strokeColor": "#2b8a3e",
			"backgroundColor": "transparent",
			"width": 155.11985778808594,
			"height": 25,
			"seed": 1019145909,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460112,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "Check avalibility",
			"rawText": "Check avalibility",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Check avalibility",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "text",
			"version": 38,
			"versionNonce": 195258491,
			"isDeleted": false,
			"id": "EHdkhdUS",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -599.9549055986228,
			"y": 400.6294660627831,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"width": 151.50794982910156,
			"height": 35,
			"seed": 1951752149,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460112,
			"link": null,
			"locked": false,
			"fontSize": 28,
			"fontFamily": 1,
			"text": "HTML Form",
			"rawText": "HTML Form",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "HTML Form",
			"lineHeight": 1.25,
			"baseline": 25
		},
		{
			"type": "rectangle",
			"version": 90,
			"versionNonce": 16887989,
			"isDeleted": false,
			"id": "F5OpfFgUZJVSgLdiO9BQV",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -115.4165057660332,
			"y": 446.17588874867863,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 450.72998046875,
			"height": 393.675537109375,
			"seed": 1410152373,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1683136460112,
			"link": null,
			"locked": false
		},
		{
			"type": "rectangle",
			"version": 61,
			"versionNonce": 1303814427,
			"isDeleted": false,
			"id": "Ok2z3eYhffAuOSNPrB9_H",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -69.72928381507836,
			"y": 486.0909305965132,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 165.1861281622023,
			"height": 138.23474702380952,
			"seed": 1978759355,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1683136460112,
			"link": null,
			"locked": false
		},
		{
			"type": "rectangle",
			"version": 99,
			"versionNonce": 122933781,
			"isDeleted": false,
			"id": "ZRtZg6eaXxG8F59Pz6egq",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -69.72928381507836,
			"y": 659.1017076612452,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 165.1861281622023,
			"height": 138.23474702380952,
			"seed": 1667432917,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1683136460112,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 32,
			"versionNonce": 639223227,
			"isDeleted": false,
			"id": "qwkUSHYh",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 119.80010606587405,
			"y": 524.1281562289537,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 74.47996520996094,
			"height": 25,
			"seed": 494312245,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460112,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "- [ ] ...",
			"rawText": "- [ ] ...",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "- [ ] ...",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "text",
			"version": 59,
			"versionNonce": 899336053,
			"isDeleted": false,
			"id": "K2u2UDfg",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 120.6695373344752,
			"y": 553.68780210879,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 74.47996520996094,
			"height": 25,
			"seed": 1628568917,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460112,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "- [ ] ...",
			"rawText": "- [ ] ...",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "- [ ] ...",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "text",
			"version": 87,
			"versionNonce": 468670043,
			"isDeleted": false,
			"id": "ynUtbtIh",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 119.80016419459434,
			"y": 583.2474189242662,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 74.47996520996094,
			"height": 25,
			"seed": 653725147,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460112,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "- [ ] ...",
			"rawText": "- [ ] ...",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "- [ ] ...",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "text",
			"version": 39,
			"versionNonce": 1578897621,
			"isDeleted": false,
			"id": "oYefKhii",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 118.06124352867164,
			"y": 486.30731475759944,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 106.25997924804688,
			"height": 35,
			"seed": 2094858619,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460112,
			"link": null,
			"locked": false,
			"fontSize": 28,
			"fontFamily": 1,
			"text": "VW Polo",
			"rawText": "VW Polo",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "VW Polo",
			"lineHeight": 1.25,
			"baseline": 25
		},
		{
			"type": "text",
			"version": 91,
			"versionNonce": 772395771,
			"isDeleted": false,
			"id": "euo6UEfm",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 115.45306598030857,
			"y": 661.9262693706946,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 182.81192016601562,
			"height": 35,
			"seed": 1101725877,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460112,
			"link": null,
			"locked": false,
			"fontSize": 28,
			"fontFamily": 1,
			"text": "Toyota Auris",
			"rawText": "Toyota Auris",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Toyota Auris",
			"lineHeight": 1.25,
			"baseline": 25
		},
		{
			"type": "text",
			"version": 78,
			"versionNonce": 1852649013,
			"isDeleted": false,
			"id": "mkvC9q7D",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 118.06130165739194,
			"y": 716.2657236582692,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 74.47996520996094,
			"height": 25,
			"seed": 1656080213,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460113,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "- [ ] ...",
			"rawText": "- [ ] ...",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "- [ ] ...",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "rectangle",
			"version": 147,
			"versionNonce": 1558952859,
			"isDeleted": false,
			"id": "ELf2nSPn78QIh--obDQRN",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 212.9918101860627,
			"y": 616.8088075292276,
			"strokeColor": "#2b8a3e",
			"backgroundColor": "transparent",
			"width": 82,
			"height": 30,
			"seed": 64563029,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"type": "text",
					"id": "iaa1eKEW"
				}
			],
			"updated": 1683136460113,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 135,
			"versionNonce": 91463573,
			"isDeleted": false,
			"id": "iaa1eKEW",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 231.655819280301,
			"y": 621.8088075292276,
			"strokeColor": "#2b8a3e",
			"backgroundColor": "transparent",
			"width": 44.67198181152344,
			"height": 20,
			"seed": 960722101,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460113,
			"link": null,
			"locked": false,
			"fontSize": 16,
			"fontFamily": 1,
			"text": "BOOK",
			"rawText": "BOOK",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "ELf2nSPn78QIh--obDQRN",
			"originalText": "BOOK",
			"lineHeight": 1.25,
			"baseline": 14
		},
		{
			"type": "rectangle",
			"version": 186,
			"versionNonce": 1959235643,
			"isDeleted": false,
			"id": "OXGXvzCWUV00feALwqFsy",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 220.83060428414922,
			"y": 784.3627365661006,
			"strokeColor": "#2b8a3e",
			"backgroundColor": "transparent",
			"width": 82,
			"height": 30,
			"seed": 2008341609,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"type": "text",
					"id": "N8cznEzt"
				}
			],
			"updated": 1683136460113,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 175,
			"versionNonce": 1231348981,
			"isDeleted": false,
			"id": "N8cznEzt",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 239.4946133783875,
			"y": 789.3627365661006,
			"strokeColor": "#2b8a3e",
			"backgroundColor": "transparent",
			"width": 44.67198181152344,
			"height": 20,
			"seed": 163272743,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460113,
			"link": null,
			"locked": false,
			"fontSize": 16,
			"fontFamily": 1,
			"text": "BOOK",
			"rawText": "BOOK",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "OXGXvzCWUV00feALwqFsy",
			"originalText": "BOOK",
			"lineHeight": 1.25,
			"baseline": 14
		},
		{
			"type": "freedraw",
			"version": 144,
			"versionNonce": 394252507,
			"isDeleted": false,
			"id": "lLzpmjb1M-cCj3OZ0zat5",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -302.38525906990196,
			"y": 877.1341670238394,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 312.9927357150202,
			"height": 147.15328713429392,
			"seed": 681421461,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460113,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					0,
					3.5036162284792454
				],
				[
					0,
					7.007310542412142
				],
				[
					0,
					14.01454299937052
				],
				[
					0,
					21.02185354178266
				],
				[
					0,
					24.525547855715672
				],
				[
					0,
					29.197088217323767
				],
				[
					0,
					35.036474626606946
				],
				[
					1.1679241331289631,
					38.54009085508619
				],
				[
					3.5036943139330106,
					44.37955534982325
				],
				[
					4.671540361608095,
					50.21894175910643
				],
				[
					5.839464494737058,
					54.89048212071452
				],
				[
					8.175234675541105,
					60.7298685299977
				],
				[
					9.34308072321619,
					64.23356284393071
				],
				[
					9.34308072321619,
					66.56933302473476
				],
				[
					12.846696951695435,
					73.57664356714702
				],
				[
					14.014621084824284,
					77.08025979562615
				],
				[
					16.350391265628332,
					82.9197242903632
				],
				[
					17.51823731330353,
					86.42334051884234
				],
				[
					22.189777674911625,
					92.26272692812552
				],
				[
					25.693471988844635,
					98.10219142286257
				],
				[
					29.197088217323767,
					101.60580765134182
				],
				[
					31.532858398127814,
					105.10950196527483
				],
				[
					35.036552712060825,
					108.61311819375396
				],
				[
					37.37224480741099,
					113.28465855536206
				],
				[
					39.70801498821504,
					115.6204287361661
				],
				[
					43.21170930214805,
					119.12404496464524
				],
				[
					49.051095711431344,
					122.62773927857825
				],
				[
					51.38686589223539,
					124.9635094593823
				],
				[
					56.058406253843486,
					127.29927964018634
				],
				[
					60.72994661545158,
					129.6350498209904
				],
				[
					64.23356284393071,
					131.97082000179444
				],
				[
					72.40879751947182,
					135.47443623027368
				],
				[
					77.08033788107991,
					136.64228227794877
				],
				[
					85.25549447116725,
					141.31382263955686
				],
				[
					92.2628050135794,
					143.6495928203609
				],
				[
					102.77373178447067,
					147.15328713429392
				],
				[
					109.78104232688281,
					147.15328713429392
				],
				[
					117.95619891697015,
					147.15328713429392
				],
				[
					128.4672037733153,
					147.15328713429392
				],
				[
					136.64236036340253,
					147.15328713429392
				],
				[
					145.98544108661883,
					147.15328713429392
				],
				[
					154.16059767670606,
					147.15328713429392
				],
				[
					163.50367839992225,
					144.81751695348987
				],
				[
					170.5109889423344,
					143.6495928203609
				],
				[
					179.8540696655507,
					140.14597659188178
				],
				[
					189.197072303313,
					135.47443623027368
				],
				[
					195.03653679805007,
					133.13866604946963
				],
				[
					200.87592320733324,
					129.6350498209904
				],
				[
					205.54746356894145,
					124.9635094593823
				],
				[
					209.05115788287435,
					121.45981514544928
				],
				[
					218.39416052063677,
					113.28465855536206
				],
				[
					223.06570088224487,
					107.44527214607888
				],
				[
					227.73724124385296,
					103.94157783214587
				],
				[
					232.40878160546106,
					96.93426728973373
				],
				[
					235.91247591939407,
					91.09488088045043
				],
				[
					239.41609214787331,
					84.08757033803829
				],
				[
					245.2554785571565,
					75.91241374795106
				],
				[
					249.9270189187646,
					63.06563871080175
				],
				[
					254.59855928037268,
					54.89048212071452
				],
				[
					256.93432946117673,
					49.051095711431344
				],
				[
					259.2700996419808,
					43.211631216694286
				],
				[
					261.6058698227848,
					38.54009085508619
				],
				[
					268.61318036519697,
					30.36493426499885
				],
				[
					270.948950546001,
					23.35762372258671
				],
				[
					272.1167965936762,
					18.686083360978614
				],
				[
					274.45256677448026,
					11.678772818566472
				],
				[
					276.7883369552843,
					8.17515659008734
				],
				[
					277.95626108841327,
					4.671540361608095
				],
				[
					277.95626108841327,
					3.5036162284792454
				],
				[
					276.7883369552843,
					3.5036162284792454
				],
				[
					275.6204909076092,
					5.839386409283293
				],
				[
					273.2847207268052,
					7.007310542412142
				],
				[
					269.78102641287217,
					9.343002637762424
				],
				[
					267.4452562320681,
					10.510926770891388
				],
				[
					265.10948605126396,
					11.678772818566472
				],
				[
					262.7737158704599,
					14.01454299937052
				],
				[
					261.6058698227848,
					15.182467132499482
				],
				[
					260.43802377510974,
					17.51823731330353
				],
				[
					258.1022535943057,
					17.51823731330353
				],
				[
					256.93432946117673,
					18.686083360978614
				],
				[
					255.76648341350165,
					19.854007494107577
				],
				[
					254.59855928037268,
					21.02185354178266
				],
				[
					252.26278909956864,
					22.189777674911625
				],
				[
					248.7591728710895,
					24.525547855715672
				],
				[
					247.59124873796054,
					25.693393903390756
				],
				[
					247.59124873796054,
					26.86131803651972
				],
				[
					249.9270189187646,
					24.525547855715672
				],
				[
					253.4307132326976,
					22.189777674911625
				],
				[
					256.93432946117673,
					18.686083360978614
				],
				[
					259.2700996419808,
					16.350313180174567
				],
				[
					260.43802377510974,
					15.182467132499482
				],
				[
					261.6058698227848,
					15.182467132499482
				],
				[
					262.7737158704599,
					14.01454299937052
				],
				[
					263.9416400035889,
					14.01454299937052
				],
				[
					266.2774101843929,
					11.678772818566472
				],
				[
					268.61318036519697,
					8.17515659008734
				],
				[
					270.948950546001,
					5.839386409283293
				],
				[
					272.1167965936762,
					5.839386409283293
				],
				[
					274.45256677448026,
					4.671540361608095
				],
				[
					275.6204909076092,
					3.5036162284792454
				],
				[
					276.7883369552843,
					1.1678460476750843
				],
				[
					279.12410713608836,
					0
				],
				[
					280.2920312692173,
					0
				],
				[
					282.62780145002137,
					0
				],
				[
					284.9635716308254,
					2.3357701808040474
				],
				[
					288.46718785930454,
					7.007310542412142
				],
				[
					290.8029580401086,
					9.343002637762424
				],
				[
					291.9708040877837,
					11.678772818566472
				],
				[
					293.13872822091264,
					12.846696951695435
				],
				[
					293.13872822091264,
					15.182467132499482
				],
				[
					295.4744984017167,
					17.51823731330353
				],
				[
					296.64234444939177,
					18.686083360978614
				],
				[
					300.1460387633248,
					22.189777674911625
				],
				[
					301.313884811,
					25.693393903390756
				],
				[
					301.313884811,
					26.86131803651972
				],
				[
					303.649654991804,
					29.197088217323767
				],
				[
					304.8175791249329,
					30.36493426499885
				],
				[
					305.9854251726081,
					31.532858398127814
				],
				[
					307.15334930573704,
					33.86862857893186
				],
				[
					307.15334930573704,
					35.036474626606946
				],
				[
					308.3211953534121,
					36.204320674282144
				],
				[
					310.65696553421617,
					38.54009085508619
				],
				[
					310.65696553421617,
					39.708014988215155
				],
				[
					311.82481158189125,
					40.87586103589024
				],
				[
					311.82481158189125,
					42.0437851690192
				],
				[
					312.9927357150202,
					42.0437851690192
				],
				[
					312.9927357150202,
					42.0437851690192
				]
			],
			"lastCommittedPoint": null,
			"simulatePressure": true,
			"pressures": []
		},
		{
			"type": "freedraw",
			"version": 156,
			"versionNonce": 2110160469,
			"isDeleted": false,
			"id": "nYExs3sLkUEFUTkmhj9z1",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 248.37693292911206,
			"y": 867.1021134908951,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 238.24808992929047,
			"height": 150.65690336277305,
			"seed": 1461869883,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460113,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					1.1678460476750843,
					0
				],
				[
					2.3356920953501685,
					4.671462276154216
				],
				[
					2.3356920953501685,
					10.510926770891274
				],
				[
					2.3356920953501685,
					17.518237313303416
				],
				[
					2.3356920953501685,
					22.18977767491151
				],
				[
					2.3356920953501685,
					26.86123995106584
				],
				[
					2.3356920953501685,
					31.532780312673935
				],
				[
					2.3356920953501685,
					36.20432067428203
				],
				[
					2.3356920953501685,
					43.21163121669417
				],
				[
					5.839386409283179,
					51.38686589223528
				],
				[
					5.839386409283179,
					59.56202248232262
				],
				[
					8.175078504633348,
					67.73717907240984
				],
				[
					8.175078504633348,
					72.40871943401794
				],
				[
					10.510926770891274,
					75.91241374795095
				],
				[
					12.846618866241442,
					81.75180015723413
				],
				[
					14.014464913916527,
					84.08757033803818
				],
				[
					17.518159227849537,
					92.26272692812552
				],
				[
					18.68600527552462,
					94.59849710892956
				],
				[
					21.021853541782548,
					100.43796160366662
				],
				[
					24.52554785571556,
					105.10942387982084
				],
				[
					26.861239951065727,
					109.78096424142893
				],
				[
					29.196932046415895,
					114.45250460303714
				],
				[
					30.364934264998737,
					116.78827478384119
				],
				[
					33.86847240802399,
					119.12404496464524
				],
				[
					35.03647462660683,
					121.45981514544928
				],
				[
					37.372166721957,
					123.79558532625333
				],
				[
					40.87586103589001,
					127.29920155473246
				],
				[
					46.71524744517342,
					131.97074191634056
				],
				[
					50.21894175910643,
					135.47443623027357
				],
				[
					51.38678780678151,
					137.81020641107762
				],
				[
					54.89048212071452,
					140.14597659188166
				],
				[
					58.394020263739776,
					142.4817467726857
				],
				[
					64.23356284393071,
					144.81751695348976
				],
				[
					68.90510320553881,
					147.1532871342938
				],
				[
					72.40864134856406,
					148.321133181969
				],
				[
					85.25541638571326,
					149.48905731509785
				],
				[
					93.43065106125437,
					150.65690336277305
				],
				[
					101.60572956588794,
					150.65690336277305
				],
				[
					110.94881028910413,
					150.65690336277305
				],
				[
					117.95619891697015,
					150.65690336277305
				],
				[
					124.96343137392842,
					150.65690336277305
				],
				[
					130.8028177832116,
					150.65690336277305
				],
				[
					138.9780524587527,
					149.48905731509785
				],
				[
					143.6495928203608,
					149.48905731509785
				],
				[
					149.48897922964397,
					145.98536300116484
				],
				[
					152.99267354357698,
					143.6495928203608
				],
				[
					161.16775204821056,
					140.14597659188166
				],
				[
					171.67883499000936,
					133.13866604946952
				],
				[
					176.35037535161746,
					127.29920155473246
				],
				[
					179.85391349464294,
					121.45981514544928
				],
				[
					184.52545385625103,
					116.78827478384119
				],
				[
					184.52545385625103,
					110.9488883745579
				],
				[
					188.02914817018404,
					105.10942387982084
				],
				[
					190.3648402655342,
					99.27003747053766
				],
				[
					195.0363806271423,
					91.09488088045043
				],
				[
					198.54007494107532,
					81.75180015723413
				],
				[
					200.87592320733324,
					71.24087338634286
				],
				[
					205.54730739803358,
					61.897792663126666
				],
				[
					206.71530961661642,
					56.05832816838961
				],
				[
					211.38684997822452,
					47.88317157830227
				],
				[
					211.38684997822452,
					44.379555349823136
				],
				[
					212.5546960258996,
					43.21163121669417
				],
				[
					213.7225420735747,
					38.54009085508608
				],
				[
					216.0583903398326,
					32.7007044458029
				],
				[
					217.2262363875077,
					28.029164084194804
				],
				[
					217.2262363875077,
					24.52554785571556
				],
				[
					218.39408243518278,
					19.854007494107464
				],
				[
					218.39408243518278,
					16.350313180174453
				],
				[
					219.56192848285787,
					12.846696951695321
				],
				[
					219.56192848285787,
					10.510926770891274
				],
				[
					219.56192848285787,
					9.34300263776231
				],
				[
					219.56192848285787,
					8.175156590087227
				],
				[
					219.56192848285787,
					7.007232456958263
				],
				[
					219.56192848285787,
					8.175156590087227
				],
				[
					218.39408243518278,
					9.34300263776231
				],
				[
					214.89038812124977,
					12.846696951695321
				],
				[
					212.5546960258996,
					15.182467132499369
				],
				[
					209.0510017119666,
					18.6860833609785
				],
				[
					206.71530961661642,
					21.02185354178266
				],
				[
					204.3794613503585,
					24.52554785571556
				],
				[
					203.2116153026834,
					26.86123995106584
				],
				[
					199.7079209887504,
					29.197010131869888
				],
				[
					198.54007494107532,
					30.36493426499885
				],
				[
					197.37222889340023,
					33.86855049347798
				],
				[
					195.0363806271423,
					36.20432067428203
				],
				[
					193.86853457946722,
					38.54009085508608
				],
				[
					193.86853457946722,
					36.20432067428203
				],
				[
					193.86853457946722,
					35.036474626606946
				],
				[
					196.20438284572515,
					31.532780312673935
				],
				[
					196.20438284572515,
					29.197010131869888
				],
				[
					197.37222889340023,
					28.029164084194804
				],
				[
					198.54007494107532,
					26.86123995106584
				],
				[
					199.7079209887504,
					25.693393903390756
				],
				[
					199.7079209887504,
					24.52554785571556
				],
				[
					200.87592320733324,
					22.18977767491151
				],
				[
					204.3794613503585,
					18.6860833609785
				],
				[
					204.3794613503585,
					16.350313180174453
				],
				[
					205.54730739803358,
					15.182467132499369
				],
				[
					206.71530961661642,
					14.014542999370406
				],
				[
					207.8831556642915,
					12.846696951695321
				],
				[
					210.21884775964168,
					10.510926770891274
				],
				[
					210.21884775964168,
					8.175156590087227
				],
				[
					211.38684997822452,
					8.175156590087227
				],
				[
					211.38684997822452,
					7.007232456958263
				],
				[
					212.5546960258996,
					7.007232456958263
				],
				[
					213.7225420735747,
					5.839386409283179
				],
				[
					213.7225420735747,
					4.671462276154216
				],
				[
					214.89038812124977,
					3.5036162284791317
				],
				[
					214.89038812124977,
					2.3356920953501685
				],
				[
					216.0583903398326,
					2.3356920953501685
				],
				[
					217.2262363875077,
					2.3356920953501685
				],
				[
					218.39408243518278,
					2.3356920953501685
				],
				[
					219.56192848285787,
					2.3356920953501685
				],
				[
					220.7299307014407,
					2.3356920953501685
				],
				[
					221.8977767491158,
					2.3356920953501685
				],
				[
					224.23346884446596,
					2.3356920953501685
				],
				[
					226.5693171107239,
					4.671462276154216
				],
				[
					227.73716315839897,
					5.839386409283179
				],
				[
					228.90500920607428,
					8.175156590087227
				],
				[
					228.90500920607428,
					9.34300263776231
				],
				[
					231.24085747233198,
					11.678772818566358
				],
				[
					231.24085747233198,
					15.182467132499369
				],
				[
					232.40870352000707,
					16.350313180174453
				],
				[
					233.57654956768238,
					21.02185354178266
				],
				[
					233.57654956768238,
					23.35762372258671
				],
				[
					233.57654956768238,
					24.52554785571556
				],
				[
					233.57654956768238,
					26.86123995106584
				],
				[
					234.74439561535746,
					28.029164084194804
				],
				[
					234.74439561535746,
					30.36493426499885
				],
				[
					234.74439561535746,
					31.532780312673935
				],
				[
					235.91239783394008,
					33.86855049347798
				],
				[
					235.91239783394008,
					36.20432067428203
				],
				[
					235.91239783394008,
					37.37224480741099
				],
				[
					235.91239783394008,
					38.54009085508608
				],
				[
					237.0802438816154,
					39.70801498821504
				],
				[
					237.0802438816154,
					40.875861035890125
				],
				[
					237.0802438816154,
					42.04378516901909
				],
				[
					238.24808992929047,
					43.21163121669417
				],
				[
					238.24808992929047,
					43.21163121669417
				]
			],
			"lastCommittedPoint": null,
			"simulatePressure": true,
			"pressures": []
		},
		{
			"type": "rectangle",
			"version": 142,
			"versionNonce": 111607163,
			"isDeleted": false,
			"id": "RQcMpNSz1Wlx7ENEnAOzf",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 405.97587128434805,
			"y": 448.371228317748,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 450.72998046875,
			"height": 393.675537109375,
			"seed": 325727515,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1683136460113,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 65,
			"versionNonce": 1500375989,
			"isDeleted": false,
			"id": "HqQ8PDYt",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -255.1511431182725,
			"y": 1046.9086060489667,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 195.05990600585938,
			"height": 25,
			"seed": 308750171,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460113,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "$sql = \"SELECT ...\"",
			"rawText": "$sql = \"SELECT ...\"",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "$sql = \"SELECT ...\"",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "text",
			"version": 174,
			"versionNonce": 763336219,
			"isDeleted": false,
			"id": "EshXE5xW",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 182.81847708910988,
			"y": 1033.7366420253695,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 389.1397705078125,
			"height": 25,
			"seed": 161301883,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460113,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "$sql = \"INSERT INTO reservations ...\"",
			"rawText": "$sql = \"INSERT INTO reservations ...\"",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "$sql = \"INSERT INTO reservations ...\"",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "text",
			"version": 90,
			"versionNonce": 478194965,
			"isDeleted": false,
			"id": "Tq4ECbjK",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 439.4560787722644,
			"y": 483.94378633569744,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 341.43975830078125,
			"height": 50,
			"seed": 208130261,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460113,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "// Save info into variables, before\nINSERT INTO",
			"rawText": "// Save info into variables, before\nINSERT INTO",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "// Save info into variables, before\nINSERT INTO",
			"lineHeight": 1.25,
			"baseline": 42
		},
		{
			"type": "text",
			"version": 86,
			"versionNonce": 1794906811,
			"isDeleted": false,
			"id": "1gV30wVk",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 653.7405539984156,
			"y": 325.39247183117453,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 605.3596801757812,
			"height": 25,
			"seed": 1155808667,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460114,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "JSON in MariaDb -> Save in a variable as a LONG VARCHAR",
			"rawText": "JSON in MariaDb -> Save in a variable as a LONG VARCHAR",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "JSON in MariaDb -> Save in a variable as a LONG VARCHAR",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "text",
			"version": 181,
			"versionNonce": 1718895221,
			"isDeleted": false,
			"id": "jH30e78m",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 434.5617211920646,
			"y": 550.0175114060524,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 278.43988037109375,
			"height": 25,
			"seed": 538154203,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460114,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "// $sql = \"INSERT INTO...\"",
			"rawText": "// $sql = \"INSERT INTO...\"",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "// $sql = \"INSERT INTO...\"",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "text",
			"version": 29,
			"versionNonce": 1679484923,
			"isDeleted": false,
			"id": "aTuZEtlw",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -209.97407685609943,
			"y": 982.6593187288145,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"width": 78.37196350097656,
			"height": 35,
			"seed": 379840405,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460114,
			"link": null,
			"locked": false,
			"fontSize": 28,
			"fontFamily": 1,
			"text": "POST",
			"rawText": "POST",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "POST",
			"lineHeight": 1.25,
			"baseline": 25
		},
		{
			"type": "text",
			"version": 93,
			"versionNonce": 761522485,
			"isDeleted": false,
			"id": "HgO63MI0",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 318.1661585628394,
			"y": 970.3404587372978,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"width": 78.37196350097656,
			"height": 35,
			"seed": 822689237,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460114,
			"link": null,
			"locked": false,
			"fontSize": 28,
			"fontFamily": 1,
			"text": "POST",
			"rawText": "POST",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "POST",
			"lineHeight": 1.25,
			"baseline": 25
		},
		{
			"type": "arrow",
			"version": 97,
			"versionNonce": 974270619,
			"isDeleted": false,
			"id": "G7_1HmW0olfHRsOqVkz6K",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 928.6003054318704,
			"y": 649.7873108570128,
			"strokeColor": "#2b8a3e",
			"backgroundColor": "transparent",
			"width": 173.8857397442215,
			"height": 7.420264223015124,
			"seed": 2083959195,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1683136460114,
			"link": null,
			"locked": false,
			"startBinding": null,
			"endBinding": {
				"elementId": "YZeTBBvY",
				"focus": -0.008060496859689958,
				"gap": 20.4475333824862
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "arrow",
			"points": [
				[
					0,
					0
				],
				[
					173.8857397442215,
					7.420264223015124
				]
			]
		},
		{
			"type": "text",
			"version": 376,
			"versionNonce": 1272642197,
			"isDeleted": false,
			"id": "YZeTBBvY",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1122.9335785585781,
			"y": 571.9713166374859,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 503.90625,
			"height": 192,
			"seed": 588708539,
			"groupIds": [],
			"roundness": null,
			"boundElements": [
				{
					"id": "G7_1HmW0olfHRsOqVkz6K",
					"type": "arrow"
				}
			],
			"updated": 1683136460114,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "$reservation_number (GENERATE IT)\n$customer_id = FROM the $_SESSION variable\n$car_id = $_POST['car_id'];\n$date_in = $_POST['date_in'];\n$date_out = $_POST['date_out'];\n$extras_array = $_POST['extras'];\n\n$extras_json = json_encode ($extras-array);",
			"rawText": "$reservation_number (GENERATE IT)\n$customer_id = FROM the $_SESSION variable\n$car_id = $_POST['car_id'];\n$date_in = $_POST['date_in'];\n$date_out = $_POST['date_out'];\n$extras_array = $_POST['extras'];\n\n$extras_json = json_encode ($extras-array);",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "$reservation_number (GENERATE IT)\n$customer_id = FROM the $_SESSION variable\n$car_id = $_POST['car_id'];\n$date_in = $_POST['date_in'];\n$date_out = $_POST['date_out'];\n$extras_array = $_POST['extras'];\n\n$extras_json = json_encode ($extras-array);",
			"lineHeight": 1.2,
			"baseline": 187
		},
		{
			"type": "arrow",
			"version": 297,
			"versionNonce": 539549685,
			"isDeleted": false,
			"id": "Z4-OgYAWLXODtUZ7vwIRX",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 899.0465726579447,
			"y": 789.1855335394681,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"width": 193.65513462920683,
			"height": 197.13393549162038,
			"seed": 42356181,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1683136460114,
			"link": null,
			"locked": false,
			"startBinding": null,
			"endBinding": null,
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "arrow",
			"points": [
				[
					0,
					0
				],
				[
					143.7918829177289,
					74.21516787793735
				],
				[
					193.65513462920683,
					197.13393549162038
				]
			]
		},
		{
			"type": "text",
			"version": 286,
			"versionNonce": 1884494165,
			"isDeleted": false,
			"id": "VVFp84cf",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 836.4276144077623,
			"y": 1016.4693349466431,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 1160.15625,
			"height": 48,
			"seed": 1541649115,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460114,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "INSERT INTO reservations (reservation_number, customer_id, car_id, date_in, date_out, extras)\nVALUES ('$reservation_number', '$customer_id', '$car_id', '$date_in', '$date_out', '$extras_json');",
			"rawText": "INSERT INTO reservations (reservation_number, customer_id, car_id, date_in, date_out, extras)\nVALUES ('$reservation_number', '$customer_id', '$car_id', '$date_in', '$date_out', '$extras_json');",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "INSERT INTO reservations (reservation_number, customer_id, car_id, date_in, date_out, extras)\nVALUES ('$reservation_number', '$customer_id', '$car_id', '$date_in', '$date_out', '$extras_json');",
			"lineHeight": 1.2,
			"baseline": 43
		},
		{
			"type": "line",
			"version": 116,
			"versionNonce": 1157993083,
			"isDeleted": false,
			"id": "LTkD87CbRcMUQuUch1w-p",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1124.011225178438,
			"y": 771.791374162618,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"width": 510.22895933970494,
			"height": 1.1596519757320038,
			"seed": 1896335477,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1683136460115,
			"link": null,
			"locked": false,
			"startBinding": null,
			"endBinding": null,
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": null,
			"points": [
				[
					0,
					0
				],
				[
					510.22895933970494,
					1.1596519757320038
				]
			]
		},
		{
			"type": "arrow",
			"version": 79,
			"versionNonce": 632235701,
			"isDeleted": false,
			"id": "te0FkBf6SHy-aGwpwj0Mr",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1672.2482992639866,
			"y": 759.2614152774277,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"width": 132.2979182875465,
			"height": 48.56794083737407,
			"seed": 1076477333,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1683136460115,
			"link": null,
			"locked": false,
			"startBinding": null,
			"endBinding": {
				"focus": 0.4234049628968585,
				"gap": 14.610266527090857,
				"elementId": "NYwqXhYh"
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "arrow",
			"points": [
				[
					0,
					0
				],
				[
					132.2979182875465,
					-48.56794083737407
				]
			]
		},
		{
			"type": "text",
			"version": 128,
			"versionNonce": 759401243,
			"isDeleted": false,
			"id": "NYwqXhYh",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1818.350964534895,
			"y": 658.9375243427845,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 269.53125,
			"height": 48,
			"seed": 1020732603,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460115,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "from ARRAY to json\n(SQL can't save arrays)",
			"rawText": "from ARRAY to json\n(SQL can't save arrays)",
			"textAlign": "center",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "from ARRAY to json\n(SQL can't save arrays)",
			"lineHeight": 1.2,
			"baseline": 43
		},
		{
			"type": "arrow",
			"version": 170,
			"versionNonce": 1659013141,
			"isDeleted": false,
			"id": "aMPmBsLS-9i4XTOtOxZpG",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1717.8466745390556,
			"y": 781.3080716055435,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"width": 545.5654439758559,
			"height": 266.3098711873231,
			"seed": 311757083,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1683136460115,
			"link": null,
			"locked": false,
			"startBinding": null,
			"endBinding": null,
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "arrow",
			"points": [
				[
					0,
					0
				],
				[
					545.5654439758559,
					177.53995534167984
				],
				[
					309.770202379912,
					266.3098711873231
				]
			]
		},
		{
			"type": "line",
			"version": 63,
			"versionNonce": 410611643,
			"isDeleted": false,
			"id": "UqEUOqzf8iGtT8Cd_6snF",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1814.7592056856968,
			"y": 1066.0672896501972,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"width": 163.02844423149418,
			"height": 1.6551141984937203,
			"seed": 2037525147,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1683136460115,
			"link": null,
			"locked": false,
			"startBinding": null,
			"endBinding": null,
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": null,
			"points": [
				[
					0,
					0
				],
				[
					163.02844423149418,
					1.6551141984937203
				]
			]
		},
		{
			"type": "text",
			"version": 145,
			"versionNonce": 1508031861,
			"isDeleted": false,
			"id": "neV0r74m",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 6.281060493002873,
			"x": 1815.6615300560447,
			"y": 513.1682705873274,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"width": 480.46875,
			"height": 72,
			"seed": 483015477,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460115,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "$extras_json\n\n$extras_array = json_decode($extras_json)",
			"rawText": "$extras_json\n\n$extras_array = json_decode($extras_json)",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "$extras_json\n\n$extras_array = json_decode($extras_json)",
			"lineHeight": 1.2,
			"baseline": 67
		},
		{
			"type": "arrow",
			"version": 69,
			"versionNonce": 952746075,
			"isDeleted": false,
			"id": "UUNKN0M9cHdc3l-zbRMHC",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 2105.718507683414,
			"y": 536.4720440478355,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 197.6679924973564,
			"height": 109.38779152937047,
			"seed": 1402179739,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1683136460115,
			"link": null,
			"locked": false,
			"startBinding": null,
			"endBinding": {
				"elementId": "1sEnK5kc",
				"focus": 0.45902760423695094,
				"gap": 12.393286399572503
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "arrow",
			"points": [
				[
					0,
					0
				],
				[
					197.6679924973564,
					-109.38779152937047
				]
			]
		},
		{
			"type": "text",
			"version": 243,
			"versionNonce": 1643464405,
			"isDeleted": false,
			"id": "1sEnK5kc",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 2300.3642035407656,
			"y": 390.69096611889256,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 210.9375,
			"height": 24,
			"seed": 176393499,
			"groupIds": [],
			"roundness": null,
			"boundElements": [
				{
					"id": "te0FkBf6SHy-aGwpwj0Mr",
					"type": "arrow"
				},
				{
					"id": "UUNKN0M9cHdc3l-zbRMHC",
					"type": "arrow"
				}
			],
			"updated": 1683136460115,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "from json to ARRAY",
			"rawText": "from json to ARRAY",
			"textAlign": "center",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "from json to ARRAY",
			"lineHeight": 1.2,
			"baseline": 19
		},
		{
			"type": "text",
			"version": 232,
			"versionNonce": 126505371,
			"isDeleted": false,
			"id": "nDIl9vLl",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 222.2592658202559,
			"y": -514.1611140280706,
			"strokeColor": "#862e9c",
			"backgroundColor": "transparent",
			"width": 1880.482177734375,
			"height": 206.02044164320873,
			"seed": 1596714619,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683137271908,
			"link": null,
			"locked": false,
			"fontSize": 164.81635331456698,
			"fontFamily": 1,
			"text": "APUNTES SQL + JSON",
			"rawText": "APUNTES SQL + JSON",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "APUNTES SQL + JSON",
			"lineHeight": 1.25,
			"baseline": 144
		},
		{
			"type": "text",
			"version": 227,
			"versionNonce": 178409333,
			"isDeleted": false,
			"id": "ePCHI0yi",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1669.2527939011031,
			"y": -27.158776934594894,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 375,
			"height": 312,
			"seed": 1639163291,
			"groupIds": [],
			"roundness": null,
			"boundElements": [
				{
					"id": "f-bRLg8oEH3dPahlKVhD8",
					"type": "arrow"
				}
			],
			"updated": 1683136668744,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "[ \n    {\n        \"name\" : \"Google\",\n        \"numberEmployees\" : 354,\n        \"ceo\" : \"John Smith\"\n    },\n\n    {\n        \"name\" : \"Amazon\",\n        \"numberEmployees\" : 512,\n        \"ceo\" : \"Jeff Smith\"\n    }\n]",
			"rawText": "[ \n    {\n        \"name\" : \"Google\",\n        \"numberEmployees\" : 354,\n        \"ceo\" : \"John Smith\"\n    },\n\n    {\n        \"name\" : \"Amazon\",\n        \"numberEmployees\" : 512,\n        \"ceo\" : \"Jeff Smith\"\n    }\n]",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "[ \n    {\n        \"name\" : \"Google\",\n        \"numberEmployees\" : 354,\n        \"ceo\" : \"John Smith\"\n    },\n\n    {\n        \"name\" : \"Amazon\",\n        \"numberEmployees\" : 512,\n        \"ceo\" : \"Jeff Smith\"\n    }\n]",
			"lineHeight": 1.2,
			"baseline": 307
		},
		{
			"type": "arrow",
			"version": 118,
			"versionNonce": 1785576891,
			"isDeleted": false,
			"id": "f-bRLg8oEH3dPahlKVhD8",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1921.8667430368876,
			"y": -45.21785963300408,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 579.6730804443357,
			"height": 163.17565917968744,
			"seed": 1164455509,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1683136668744,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "ePCHI0yi",
				"focus": -0.5554043703433835,
				"gap": 18.059082698409213
			},
			"endBinding": null,
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "arrow",
			"points": [
				[
					0,
					0
				],
				[
					311.51718139648415,
					-160.89347839355463
				],
				[
					579.6730804443357,
					2.2821807861328125
				]
			]
		},
		{
			"type": "text",
			"version": 145,
			"versionNonce": 1609796437,
			"isDeleted": false,
			"id": "a1PaF707",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 2406.980797498597,
			"y": 43.06310298316219,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 503.90625,
			"height": 48,
			"seed": 2100773243,
			"groupIds": [],
			"roundness": null,
			"boundElements": [
				{
					"id": "e8Khg6w2yTdMu0-3uBDeM",
					"type": "arrow"
				},
				{
					"id": "KcqlgxRnkujsn4qko7UnO",
					"type": "arrow"
				}
			],
			"updated": 1683137218811,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "SELECT JSON_EXTRACT(companies, '$[0].name')\nFROM info;",
			"rawText": "SELECT JSON_EXTRACT(companies, '$[0].name')\nFROM info;",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "SELECT JSON_EXTRACT(companies, '$[0].name')\nFROM info;",
			"lineHeight": 1.2,
			"baseline": 43
		},
		{
			"type": "text",
			"version": 86,
			"versionNonce": 651407803,
			"isDeleted": false,
			"id": "mNMefL72",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 2421.157131655307,
			"y": -20.879562745238548,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"width": 49.21875,
			"height": 33.6,
			"seed": 460458075,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136926912,
			"link": null,
			"locked": false,
			"fontSize": 28,
			"fontFamily": 3,
			"text": "SQL",
			"rawText": "SQL",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "SQL",
			"lineHeight": 1.2,
			"baseline": 26
		},
		{
			"type": "line",
			"version": 83,
			"versionNonce": 1681229339,
			"isDeleted": false,
			"id": "4UyNR4gqD310kQum5wSPN",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 2401.2177132935617,
			"y": 27.60951801401803,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"width": 99.5029296875,
			"height": 1.8257446289061932,
			"seed": 808516533,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1683136898928,
			"link": null,
			"locked": false,
			"startBinding": null,
			"endBinding": null,
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": null,
			"points": [
				[
					0,
					0
				],
				[
					99.5029296875,
					-1.8257446289061932
				]
			]
		},
		{
			"type": "text",
			"version": 58,
			"versionNonce": 1819367605,
			"isDeleted": false,
			"id": "wIt4g0te",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 2796.4907845826237,
			"y": -70.50920146840375,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"width": 457.03125,
			"height": 24,
			"seed": 1933952661,
			"groupIds": [],
			"roundness": null,
			"boundElements": [
				{
					"id": "KcqlgxRnkujsn4qko7UnO",
					"type": "arrow"
				}
			],
			"updated": 1683137218811,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "$ = root (principio del documento JSON)",
			"rawText": "$ = root (principio del documento JSON)",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "$ = root (principio del documento JSON)",
			"lineHeight": 1.2,
			"baseline": 19
		},
		{
			"type": "text",
			"version": 165,
			"versionNonce": 1290376219,
			"isDeleted": false,
			"id": "tzxag6xQ",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 2417.3444808625677,
			"y": 115.67516245294615,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"width": 32.8125,
			"height": 33.6,
			"seed": 2057244085,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136969338,
			"link": null,
			"locked": false,
			"fontSize": 28,
			"fontFamily": 3,
			"text": "JS",
			"rawText": "JS",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "JS",
			"lineHeight": 1.2,
			"baseline": 26
		},
		{
			"type": "line",
			"version": 182,
			"versionNonce": 1364614491,
			"isDeleted": false,
			"id": "ggNwlqIbi307JNkhVkZic",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 2389.4578363691594,
			"y": 155.4114032822855,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"width": 99.5029296875,
			"height": 1.8257446289061932,
			"seed": 1232392309,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1683136982276,
			"link": null,
			"locked": false,
			"startBinding": null,
			"endBinding": null,
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": null,
			"points": [
				[
					0,
					0
				],
				[
					99.5029296875,
					-1.8257446289061932
				]
			]
		},
		{
			"type": "text",
			"version": 323,
			"versionNonce": 837763995,
			"isDeleted": false,
			"id": "RUE4cMLs",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 2410.3636925755727,
			"y": 175.08631465308395,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 503.90625,
			"height": 48,
			"seed": 1363717051,
			"groupIds": [],
			"roundness": null,
			"boundElements": [
				{
					"id": "znMa7JnGvohTx4sJ8e79R",
					"type": "arrow"
				}
			],
			"updated": 1683137075449,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "let companies = JSON.parse(companies_json);\nconsole.log(companies[0].name);",
			"rawText": "let companies = JSON.parse(companies_json);\nconsole.log(companies[0].name);",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "let companies = JSON.parse(companies_json);\nconsole.log(companies[0].name);",
			"lineHeight": 1.2,
			"baseline": 43
		},
		{
			"type": "text",
			"version": 224,
			"versionNonce": 2115833723,
			"isDeleted": false,
			"id": "tfMbc1Xd",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 2410.618085406153,
			"y": 241.55528940607115,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"width": 49.21875,
			"height": 33.6,
			"seed": 955422933,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136980207,
			"link": null,
			"locked": false,
			"fontSize": 28,
			"fontFamily": 3,
			"text": "PHP",
			"rawText": "PHP",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "PHP",
			"lineHeight": 1.2,
			"baseline": 26
		},
		{
			"type": "line",
			"version": 222,
			"versionNonce": 458693973,
			"isDeleted": false,
			"id": "w2Q_05LOA0j31NBa-_x8n",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 2386.5750495681727,
			"y": 278.4087434344237,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"width": 99.5029296875,
			"height": 1.8257446289061932,
			"seed": 803626491,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1683136983156,
			"link": null,
			"locked": false,
			"startBinding": null,
			"endBinding": null,
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": null,
			"points": [
				[
					0,
					0
				],
				[
					99.5029296875,
					-1.8257446289061932
				]
			]
		},
		{
			"type": "text",
			"version": 438,
			"versionNonce": 243712731,
			"isDeleted": false,
			"id": "k2ZZqBtY",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 2409.402742226066,
			"y": 297.1227044557155,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 480.46875,
			"height": 48,
			"seed": 1119782811,
			"groupIds": [],
			"roundness": null,
			"boundElements": [
				{
					"id": "JvroJ5jn0IKcUlD3fAXIO",
					"type": "arrow"
				}
			],
			"updated": 1683137079961,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "$companies = json_decode(companies_json);\necho $companies[0]['name'];",
			"rawText": "$companies = json_decode(companies_json);\necho $companies[0]['name'];",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "$companies = json_decode(companies_json);\necho $companies[0]['name'];",
			"lineHeight": 1.2,
			"baseline": 43
		},
		{
			"type": "text",
			"version": 79,
			"versionNonce": 70524021,
			"isDeleted": false,
			"id": "M82reCfw",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 3000.5655567950425,
			"y": 42.165155667597844,
			"strokeColor": "#087f5b",
			"backgroundColor": "transparent",
			"width": 64.4921875,
			"height": 23,
			"seed": 1178994907,
			"groupIds": [],
			"roundness": null,
			"boundElements": [
				{
					"id": "e8Khg6w2yTdMu0-3uBDeM",
					"type": "arrow"
				}
			],
			"updated": 1683137082507,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 2,
			"text": "Google",
			"rawText": "Google",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Google",
			"lineHeight": 1.15,
			"baseline": 18
		},
		{
			"type": "text",
			"version": 128,
			"versionNonce": 126093429,
			"isDeleted": false,
			"id": "LMFu4Sdh",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 3006.3308734068855,
			"y": 180.5371874315781,
			"strokeColor": "#087f5b",
			"backgroundColor": "transparent",
			"width": 64.4921875,
			"height": 23,
			"seed": 1790355419,
			"groupIds": [],
			"roundness": null,
			"boundElements": [
				{
					"id": "znMa7JnGvohTx4sJ8e79R",
					"type": "arrow"
				}
			],
			"updated": 1683137083873,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 2,
			"text": "Google",
			"rawText": "Google",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Google",
			"lineHeight": 1.15,
			"baseline": 18
		},
		{
			"type": "text",
			"version": 172,
			"versionNonce": 167064731,
			"isDeleted": false,
			"id": "oDYhybRj",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 3013.0573973583655,
			"y": 298.7299364550157,
			"strokeColor": "#087f5b",
			"backgroundColor": "transparent",
			"width": 64.4921875,
			"height": 23,
			"seed": 1528779707,
			"groupIds": [],
			"roundness": null,
			"boundElements": [
				{
					"id": "JvroJ5jn0IKcUlD3fAXIO",
					"type": "arrow"
				}
			],
			"updated": 1683137085173,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 2,
			"text": "Google",
			"rawText": "Google",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Google",
			"lineHeight": 1.15,
			"baseline": 18
		},
		{
			"type": "arrow",
			"version": 73,
			"versionNonce": 1914946581,
			"isDeleted": false,
			"id": "e8Khg6w2yTdMu0-3uBDeM",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 2921.770262284352,
			"y": 53.83849276858626,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 69.18604800575667,
			"height": 2.516629394120585,
			"seed": 1365004251,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1683137099573,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "a1PaF707",
				"focus": -0.7124528592672734,
				"gap": 10.883214785755172
			},
			"endBinding": {
				"elementId": "M82reCfw",
				"focus": -0.3323968017328817,
				"gap": 9.609246504933708
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "arrow",
			"points": [
				[
					0,
					0
				],
				[
					69.18604800575667,
					2.516629394120585
				]
			]
		},
		{
			"type": "arrow",
			"version": 67,
			"versionNonce": 1936188085,
			"isDeleted": false,
			"id": "znMa7JnGvohTx4sJ8e79R",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 2927.535771638793,
			"y": 197.16073243291868,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 69.18598375822421,
			"height": 6.357641883634216,
			"seed": 1642655509,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1683137091733,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "RUE4cMLs",
				"focus": 0.5088286575115243,
				"gap": 13.26582906322028
			},
			"endBinding": {
				"elementId": "LMFu4Sdh",
				"focus": 0.35125506569350273,
				"gap": 9.609118009868325
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "arrow",
			"points": [
				[
					0,
					0
				],
				[
					69.18598375822421,
					-6.357641883634216
				]
			]
		},
		{
			"type": "arrow",
			"version": 58,
			"versionNonce": 1433621845,
			"isDeleted": false,
			"id": "JvroJ5jn0IKcUlD3fAXIO",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 2896.7864526626418,
			"y": 307.0559430825151,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 103.77903988486833,
			"height": 2.8186751366970952,
			"seed": 390158555,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1683137088917,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "k2ZZqBtY",
				"focus": -0.7005562406499369,
				"gap": 6.914960436575711
			},
			"endBinding": {
				"elementId": "oDYhybRj",
				"focus": -0.06947271652088945,
				"gap": 12.49190481085543
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "arrow",
			"points": [
				[
					0,
					0
				],
				[
					103.77903988486833,
					2.8186751366970952
				]
			]
		},
		{
			"type": "arrow",
			"version": 27,
			"versionNonce": 1935491195,
			"isDeleted": false,
			"id": "KcqlgxRnkujsn4qko7UnO",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 2794.4976287337126,
			"y": 30.047812785101,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 53.836067875425215,
			"height": 67.29504734935344,
			"seed": 1704753525,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1683137218811,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "a1PaF707",
				"focus": 0.3907439879126991,
				"gap": 13.01529019806119
			},
			"endBinding": {
				"elementId": "wIt4g0te",
				"focus": 0.6705277168869097,
				"gap": 9.261966904151308
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "arrow",
			"points": [
				[
					0,
					0
				],
				[
					53.836067875425215,
					-67.29504734935344
				]
			]
		},
		{
			"type": "text",
			"version": 56,
			"versionNonce": 538509915,
			"isDeleted": false,
			"id": "CL8gdyWI",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1728.4907906495187,
			"y": -66.51370316609379,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"width": 127.572265625,
			"height": 32.199999999999996,
			"seed": 915307029,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683137243375,
			"link": null,
			"locked": false,
			"fontSize": 28,
			"fontFamily": 2,
			"text": "JSON File",
			"rawText": "JSON File",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "JSON File",
			"lineHeight": 1.15,
			"baseline": 26
		},
		{
			"id": "ackBFKtI",
			"type": "text",
			"x": -257.94444016786565,
			"y": 1234.0068451018064,
			"width": 355.58209228515625,
			"height": 53.257417224702294,
			"angle": 0,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 1876773060,
			"version": 63,
			"versionNonce": 2114688380,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1683742112551,
			"link": null,
			"locked": false,
			"text": "JSON_METHODS",
			"rawText": "JSON_METHODS",
			"fontSize": 42.605933779761834,
			"fontFamily": 1,
			"textAlign": "left",
			"verticalAlign": "top",
			"baseline": 37,
			"containerId": null,
			"originalText": "JSON_METHODS",
			"lineHeight": 1.25
		},
		{
			"id": "eF5C3RLD",
			"type": "text",
			"x": -256.2056357593834,
			"y": 1324.5346248172082,
			"width": 209.2638702392578,
			"height": 20,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 758905796,
			"version": 135,
			"versionNonce": 776427644,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1683742132870,
			"link": null,
			"locked": false,
			"text": "Poner métodos JSON aqui.",
			"rawText": "Poner métodos JSON aqui.",
			"fontSize": 16,
			"fontFamily": 1,
			"textAlign": "left",
			"verticalAlign": "top",
			"baseline": 14,
			"containerId": null,
			"originalText": "Poner métodos JSON aqui.",
			"lineHeight": 1.25
		},
		{
			"id": "1SqZgSe9kf0_WnXude53O",
			"type": "freedraw",
			"x": 497.82032572490095,
			"y": 1217.651200550416,
			"width": 139.9174562107081,
			"height": 139.04288331024736,
			"angle": 0,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 20,
			"groupIds": [],
			"roundness": null,
			"seed": 72926332,
			"version": 23,
			"versionNonce": 800697340,
			"isDeleted": true,
			"boundElements": null,
			"updated": 1683741846517,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					-2.6234848270939892,
					10.493763902659794
				],
				[
					-10.493822371231772,
					25.35998302761891
				],
				[
					-20.113130310575002,
					42.84968697967179
				],
				[
					-30.606952681806774,
					67.33521404397402
				],
				[
					-48.09659816528779,
					95.31868189868692
				],
				[
					-61.21390536361355,
					112.8083858507398
				],
				[
					-69.95869887106801,
					125.0511786171769
				],
				[
					-76.95458045188923,
					132.04700172942603
				],
				[
					-77.82909488377788,
					135.5449425198367
				],
				[
					-77.82909488377788,
					137.29391291504203
				],
				[
					-76.08012448857266,
					139.04288331024736
				],
				[
					-66.46075808065746,
					139.04288331024736
				],
				[
					-49.84556856049312,
					139.04288331024736
				],
				[
					-28.85798228660144,
					139.04288331024736
				],
				[
					1.7489703952053333,
					139.04288331024736
				],
				[
					39.351746189261235,
					139.04288331024736
				],
				[
					56.841450141314226,
					139.04288331024736
				],
				[
					62.088361326930226,
					139.04288331024736
				],
				[
					62.088361326930226,
					139.04288331024736
				]
			],
			"pressures": [],
			"simulatePressure": true,
			"lastCommittedPoint": [
				62.088361326930226,
				139.04288331024736
			]
		},
		{
			"id": "1Pd_Uvv0XyvXwEyeyNdVD",
			"type": "freedraw",
			"x": 804.7641331005692,
			"y": 1257.002946739677,
			"width": 139.04294177881934,
			"height": 123.30220822197157,
			"angle": 0,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 20,
			"groupIds": [],
			"roundness": null,
			"seed": 104909892,
			"version": 36,
			"versionNonce": 50602436,
			"isDeleted": true,
			"boundElements": null,
			"updated": 1683741846517,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					0,
					-1.7489703952051059
				],
				[
					0,
					-4.3723967537271164
				],
				[
					-1.748911926633241,
					-8.744851976026439
				],
				[
					-1.748911926633241,
					-13.991763161642211
				],
				[
					-5.246852717043794,
					-20.11313031057489
				],
				[
					-12.242734297865013,
					-27.98346785471267
				],
				[
					-19.238615878686232,
					-34.10489347221733
				],
				[
					-28.85798228660144,
					-35.85386386742266
				],
				[
					-42.84968697967179,
					-36.72831983073911
				],
				[
					-55.09247974610889,
					-36.72831983073911
				],
				[
					-68.20972847586268,
					-34.10489347221733
				],
				[
					-76.95458045188923,
					-28.857982286601327
				],
				[
					-84.82491799602701,
					-20.987586273891566
				],
				[
					-87.448402823121,
					-12.242792766437105
				],
				[
					-88.32285878643768,
					2.6234263585220106
				],
				[
					-87.448402823121,
					8.744851976026439
				],
				[
					-80.45252124229978,
					17.489703952053105
				],
				[
					-70.83321330295666,
					26.234497459507566
				],
				[
					-61.213846895041456,
					34.979349435534004
				],
				[
					-54.21802378279233,
					38.47729022594467
				],
				[
					-48.97111259717644,
					46.347627770082454
				],
				[
					-44.59865737487712,
					53.34350935090379
				],
				[
					-42.84968697967179,
					62.088361326930226
				],
				[
					-42.84968697967179,
					69.08424290775156
				],
				[
					-43.72420141156044,
					74.33109562479535
				],
				[
					-53.34350935090367,
					79.57800681041135
				],
				[
					-86.57388839123234,
					83.95046203271067
				],
				[
					-109.31050352890122,
					84.82491799602712
				],
				[
					-127.67466344427089,
					86.57388839123246
				],
				[
					-136.41945695172546,
					86.57388839123246
				],
				[
					-139.04294177881934,
					86.57388839123246
				],
				[
					-139.04294177881934,
					86.57388839123246
				]
			],
			"pressures": [],
			"simulatePressure": true,
			"lastCommittedPoint": [
				-139.04294177881934,
				86.57388839123246
			]
		},
		{
			"id": "y37lfyhUJdKCmNiRQCVBZ",
			"type": "freedraw",
			"x": 940.3091340889781,
			"y": 1316.4678232395133,
			"width": 160.90504248459968,
			"height": 41.97523101635511,
			"angle": 0,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 20,
			"groupIds": [],
			"roundness": null,
			"seed": 516201412,
			"version": 36,
			"versionNonce": 941280380,
			"isDeleted": true,
			"boundElements": null,
			"updated": 1683741846517,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					0,
					1.7489703952053333
				],
				[
					0,
					2.6234848270939892
				],
				[
					0,
					4.3724552222993225
				],
				[
					-8.74479350745446,
					6.995881580821106
				],
				[
					-27.983526323284877,
					9.619366407915322
				],
				[
					-58.59042053651956,
					9.619366407915322
				],
				[
					-105.81256273849067,
					9.619366407915322
				],
				[
					-144.28979449586336,
					10.493822371231772
				],
				[
					-155.6580728304118,
					10.493822371231772
				],
				[
					-157.40710169418912,
					9.619366407915322
				],
				[
					-158.2815576575058,
					6.121425617504656
				],
				[
					-160.0305865212831,
					0.8745144318888833
				],
				[
					-160.90504248459968,
					-2.623426358521783
				],
				[
					-160.90504248459968,
					-6.995823112249127
				],
				[
					-160.90504248459968,
					-11.36827833454845
				],
				[
					-158.2815576575058,
					-15.740675088275793
				],
				[
					-151.28567607668458,
					-20.987586273891566
				],
				[
					-142.54088256923012,
					-25.359983027618682
				],
				[
					-129.42357537090425,
					-28.85792381802935
				],
				[
					-124.17672265386045,
					-31.481408645123338
				],
				[
					-121.55323782676646,
					-31.481408645123338
				],
				[
					-118.0552970363558,
					-30.606894213234682
				],
				[
					-116.30638510972256,
					-27.9834678547129
				],
				[
					-114.55735624594513,
					-24.485527064302232
				],
				[
					-114.55735624594513,
					-21.86210070578022
				],
				[
					-115.4318122092618,
					-16.61518952016445
				],
				[
					-124.17672265386045,
					-13.991704693070233
				],
				[
					-135.5450009884089,
					-11.36827833454845
				],
				[
					-142.54088256923012,
					-11.36827833454845
				],
				[
					-150.4112201133679,
					-11.36827833454845
				],
				[
					-154.78361686709513,
					-11.36827833454845
				],
				[
					-154.78361686709513,
					-11.36827833454845
				]
			],
			"pressures": [],
			"simulatePressure": true,
			"lastCommittedPoint": [
				-154.78361686709513,
				-11.36827833454845
			]
		},
		{
			"id": "Cpb6a7ozYNGgZLPrEzTm7",
			"type": "freedraw",
			"x": 860.7310688099948,
			"y": 1283.2374441991847,
			"width": 84.82491799602712,
			"height": 39.35174618926135,
			"angle": 0,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 20,
			"groupIds": [],
			"roundness": null,
			"seed": 2108914500,
			"version": 27,
			"versionNonce": 86198596,
			"isDeleted": true,
			"boundElements": null,
			"updated": 1683741846517,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					5.2469696541879784,
					0.874514431888656
				],
				[
					8.744910444598645,
					5.246911185615772
				],
				[
					13.117307198325761,
					8.744851976026439
				],
				[
					17.489703952053105,
					13.991763161642439
				],
				[
					20.113188779147094,
					18.364159915369783
				],
				[
					21.86210070578045,
					23.611071100985555
				],
				[
					23.61112956955776,
					28.857982286601327
				],
				[
					23.61112956955776,
					34.104893472217555
				],
				[
					23.61112956955776,
					38.47729022594467
				],
				[
					20.98764474246377,
					35.85386386742266
				],
				[
					18.364159915369783,
					29.732438249918232
				],
				[
					16.615247988736428,
					20.11313031057489
				],
				[
					16.615247988736428,
					14.866219124959116
				],
				[
					16.615247988736428,
					11.36827833454845
				],
				[
					20.113188779147094,
					6.995881580821333
				],
				[
					27.983526323284877,
					4.3724552222993225
				],
				[
					40.226260621150004,
					1.7489703952053333
				],
				[
					49.8456270290651,
					0.874514431888656
				],
				[
					62.9628172902469,
					-0.8744559633166773
				],
				[
					75.20566852525599,
					-0.8744559633166773
				],
				[
					83.076006069394,
					-0.8744559633166773
				],
				[
					84.82491799602712,
					-0.8744559633166773
				],
				[
					84.82491799602712,
					-0.8744559633166773
				]
			],
			"pressures": [],
			"simulatePressure": true,
			"lastCommittedPoint": [
				84.82491799602712,
				-0.8744559633166773
			]
		},
		{
			"id": "gpZ5H7OBV_nVaCsiQTion",
			"type": "freedraw",
			"x": 969.1671163755797,
			"y": 1282.362988235868,
			"width": 66.46075808065734,
			"height": 140.79191217402467,
			"angle": 0,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 20,
			"groupIds": [],
			"roundness": null,
			"seed": 956477692,
			"version": 48,
			"versionNonce": 1216601340,
			"isDeleted": true,
			"boundElements": null,
			"updated": 1683741846517,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					0.8744559633164499,
					-0.874514431888656
				],
				[
					0.8744559633164499,
					-1.7489703952053333
				],
				[
					0.8744559633164499,
					-3.497940790410439
				],
				[
					0.8744559633164499,
					-4.372455222299095
				],
				[
					-6.121425617504656,
					-1.7489703952053333
				],
				[
					-17.489703952053105,
					6.12136714893245
				],
				[
					-27.983526323284877,
					13.117248729753783
				],
				[
					-34.97940790410621,
					23.611071100985782
				],
				[
					-40.226260621150004,
					33.23037904032867
				],
				[
					-41.10071658446668,
					42.849686979672015
				],
				[
					-41.10071658446668,
					49.84556856049312
				],
				[
					-36.72831983073934,
					57.71590610463113
				],
				[
					-34.97940790410621,
					60.33939093172489
				],
				[
					-33.2303790403289,
					61.21384689504157
				],
				[
					-28.857982286601555,
					61.21384689504157
				],
				[
					-25.360041496190888,
					60.33939093172489
				],
				[
					-14.866219124959116,
					52.468994919014904
				],
				[
					-4.372396753727344,
					41.97523101635511
				],
				[
					5.246852717043794,
					29.732438249918005
				],
				[
					12.2427342978649,
					20.987586273891566
				],
				[
					14.866219124958889,
					16.61518952016445
				],
				[
					14.866219124958889,
					14.866219124959116
				],
				[
					14.866219124958889,
					13.99170469307046
				],
				[
					15.740675088275566,
					13.99170469307046
				],
				[
					17.489703952052878,
					21.86210070578022
				],
				[
					18.364159915369555,
					31.481408645123565
				],
				[
					18.364159915369555,
					42.849686979672015
				],
				[
					18.364159915369555,
					55.96693570942557
				],
				[
					18.364159915369555,
					68.20972847586268
				],
				[
					17.489703952052878,
					79.57800681041113
				],
				[
					13.991763161642211,
					90.07182918164312
				],
				[
					7.870337544137783,
					101.44010751619157
				],
				[
					-1.7490288637775393,
					113.68290028262868
				],
				[
					-14.866219124959116,
					124.17666418528847
				],
				[
					-27.109070359968428,
					134.67048655652025
				],
				[
					-30.607011150378867,
					135.5450009884089
				],
				[
					-32.35592307701222,
					136.41945695172558
				],
				[
					-33.2303790403289,
					136.41945695172558
				],
				[
					-37.602775794056015,
					132.9215161613149
				],
				[
					-42.84974544824399,
					124.17666418528847
				],
				[
					-47.22214220197134,
					115.43187067783379
				],
				[
					-48.09659816528779,
					110.18495949221801
				],
				[
					-48.09659816528779,
					105.81250426991869
				],
				[
					-48.09659816528779,
					105.81250426991869
				]
			],
			"pressures": [],
			"simulatePressure": true,
			"lastCommittedPoint": [
				-48.09659816528779,
				105.81250426991869
			]
		},
		{
			"id": "uvsiJZ8aZ9-mkHAAPk6cF",
			"type": "freedraw",
			"x": 1016.3892585775508,
			"y": 1274.4926506917302,
			"width": 1.7489119266331272,
			"height": 56.84139167274225,
			"angle": 0,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 20,
			"groupIds": [],
			"roundness": null,
			"seed": 1544055932,
			"version": 14,
			"versionNonce": 1475444932,
			"isDeleted": true,
			"boundElements": null,
			"updated": 1683741846517,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					1.7489119266331272,
					2.623426358521783
				],
				[
					1.7489119266331272,
					16.61518952016445
				],
				[
					1.7489119266331272,
					33.23037904032867
				],
				[
					1.7489119266331272,
					46.347627770082454
				],
				[
					1.7489119266331272,
					52.468994919014904
				],
				[
					1.7489119266331272,
					55.96693570942557
				],
				[
					1.7489119266331272,
					56.84139167274225
				],
				[
					1.7489119266331272,
					52.468994919014904
				],
				[
					0.8744559633164499,
					41.97517254778313
				],
				[
					0.8744559633164499,
					41.97517254778313
				]
			],
			"pressures": [],
			"simulatePressure": true,
			"lastCommittedPoint": [
				0.8744559633164499,
				41.97517254778313
			]
		},
		{
			"id": "6V8tZbP2JQG5fqBEYK-8_",
			"type": "freedraw",
			"x": 1017.2637145408672,
			"y": 1238.6387868243075,
			"width": 0.0001,
			"height": 0.0001,
			"angle": 0,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 20,
			"groupIds": [],
			"roundness": null,
			"seed": 742645628,
			"version": 5,
			"versionNonce": 2054610300,
			"isDeleted": true,
			"boundElements": null,
			"updated": 1683741846517,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					0.0001,
					0.0001
				]
			],
			"pressures": [],
			"simulatePressure": true,
			"lastCommittedPoint": [
				0.0001,
				0.0001
			]
		},
		{
			"id": "jVWknnRjc1flqI9jMhDAO",
			"type": "freedraw",
			"x": 127.03915739281115,
			"y": 1229.8939348482809,
			"width": 0.0001,
			"height": 0.0001,
			"angle": 0,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 20,
			"groupIds": [],
			"roundness": null,
			"seed": 1343978948,
			"version": 5,
			"versionNonce": 856475716,
			"isDeleted": true,
			"boundElements": null,
			"updated": 1683741846517,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					0.0001,
					0.0001
				]
			],
			"pressures": [],
			"simulatePressure": true,
			"lastCommittedPoint": [
				0.0001,
				0.0001
			]
		},
		{
			"id": "hNvxf0O3pZBSqBAYiUWfN",
			"type": "freedraw",
			"x": 173.38681439717965,
			"y": 1201.9104669935682,
			"width": 0.0001,
			"height": 0.0001,
			"angle": 0,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 20,
			"groupIds": [],
			"roundness": null,
			"seed": 385073404,
			"version": 5,
			"versionNonce": 1731579388,
			"isDeleted": true,
			"boundElements": null,
			"updated": 1683741846517,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					0.0001,
					0.0001
				]
			],
			"pressures": [],
			"simulatePressure": true,
			"lastCommittedPoint": [
				0.0001,
				0.0001
			]
		},
		{
			"id": "EGMU2Cv513eH49uI15kiK",
			"type": "freedraw",
			"x": 196.9978854981652,
			"y": 1180.9228807196766,
			"width": 133.79603059320357,
			"height": 111.05941545553446,
			"angle": 0,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 20,
			"groupIds": [],
			"roundness": null,
			"seed": 143762500,
			"version": 47,
			"versionNonce": 710090692,
			"isDeleted": true,
			"boundElements": null,
			"updated": 1683741846517,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					0.8744851976026098,
					0
				],
				[
					6.1213671489325066,
					6.12136714893245
				],
				[
					7.87033754413784,
					8.74479350745446
				],
				[
					10.493793136945783,
					14.866219124958889
				],
				[
					12.24276353215106,
					17.4896454834809
				],
				[
					13.117248729753726,
					23.611012632413576
				],
				[
					14.86621912495906,
					28.85792381802935
				],
				[
					14.86621912495906,
					34.979349435534004
				],
				[
					14.86621912495906,
					41.100716584466454
				],
				[
					14.86621912495906,
					48.09659816528779
				],
				[
					13.991733927356393,
					55.09247974610889
				],
				[
					11.36827833454845,
					62.08830285835825
				],
				[
					9.619307939343116,
					69.95869887106801
				],
				[
					6.1213671489325066,
					75.20561005668401
				],
				[
					1.7489703952052764,
					82.20143316893314
				],
				[
					-0.8744851976026666,
					85.6993739593438
				],
				[
					-4.372425988013276,
					90.0718291816429
				],
				[
					-10.493822371231829,
					94.44422593537024
				],
				[
					-20.987615508177612,
					100.56559308430269
				],
				[
					-30.606952681806774,
					104.93804830660201
				],
				[
					-41.100745818752614,
					106.68701870180735
				],
				[
					-49.84559779477911,
					109.31044506032936
				],
				[
					-57.71593533891695,
					110.18495949221801
				],
				[
					-63.8373317221355,
					111.05941545553446
				],
				[
					-66.46078731494345,
					111.05941545553446
				],
				[
					-73.45663966147868,
					111.05941545553446
				],
				[
					-76.08009525428662,
					111.05941545553446
				],
				[
					-81.3270064399025,
					111.05941545553446
				],
				[
					-85.69943242791578,
					109.31044506032936
				],
				[
					-89.19737321832639,
					107.5614746651238
				],
				[
					-92.69528477445095,
					105.81250426991869
				],
				[
					-96.19322556486156,
					101.44010751619135
				],
				[
					-100.56565155287484,
					98.81662268909736
				],
				[
					-104.06359234328545,
					96.19319633057535
				],
				[
					-105.81256273849073,
					93.56976997205356
				],
				[
					-108.43601833129867,
					89.19731474975424
				],
				[
					-110.18495949221796,
					85.6993739593438
				],
				[
					-113.68290028262857,
					81.32697720561646
				],
				[
					-115.4318706778339,
					76.08006602000046
				],
				[
					-116.30635587543651,
					73.45663966147845
				],
				[
					-117.18084107303918,
					71.70766926627334
				],
				[
					-118.92981146824451,
					69.95869887106801
				],
				[
					-118.92981146824451,
					69.95869887106801
				]
			],
			"pressures": [],
			"simulatePressure": true,
			"lastCommittedPoint": [
				-118.92981146824451,
				69.95869887106801
			]
		},
		{
			"id": "13BywIiLhAVsDHDvm8Nrx",
			"type": "freedraw",
			"x": 205.7427082399057,
			"y": 1309.4720001272642,
			"width": 185.3905987831879,
			"height": 239.60853486312226,
			"angle": 0,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 20,
			"groupIds": [],
			"roundness": null,
			"seed": 25070844,
			"version": 107,
			"versionNonce": 801287804,
			"isDeleted": true,
			"boundElements": null,
			"updated": 1683741846517,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					0.8744851976026098,
					0
				],
				[
					3.497940790410553,
					2.623426358521783
				],
				[
					10.493822371231772,
					13.117248729753783
				],
				[
					11.368307568834439,
					15.740675088275793
				],
				[
					17.489674717767002,
					25.359983027618682
				],
				[
					21.86210070578022,
					30.60689421323491
				],
				[
					24.48555629858822,
					33.23037904032867
				],
				[
					25.36004149619083,
					34.10483500364535
				],
				[
					25.36004149619083,
					36.72831983073934
				],
				[
					25.36004149619083,
					39.35174618926135
				],
				[
					22.73658590338289,
					52.468994919014904
				],
				[
					16.615189520164336,
					68.20972847586268
				],
				[
					12.242792766437105,
					83.07594760082179
				],
				[
					11.368307568834439,
					96.19319633057557
				],
				[
					9.619337173629162,
					109.31044506032936
				],
				[
					6.121396383218553,
					120.6787233948778
				],
				[
					5.246911185615886,
					132.04706019799823
				],
				[
					5.246911185615886,
					135.54494251983692
				],
				[
					4.3724259880132195,
					135.54494251983692
				],
				[
					2.623455592807943,
					133.79597212463136
				],
				[
					2.623455592807943,
					123.30220822197157
				],
				[
					2.623455592807943,
					110.18495949221801
				],
				[
					5.246911185615886,
					92.69525554016491
				],
				[
					10.493822371231772,
					73.45663966147868
				],
				[
					13.991733927356393,
					62.08830285835825
				],
				[
					15.740704322561669,
					50.7200245238098
				],
				[
					15.740704322561669,
					48.09659816528779
				],
				[
					15.740704322561669,
					47.22208373339913
				],
				[
					16.615189520164336,
					46.347627770082454
				],
				[
					21.86210070578022,
					44.59865737487712
				],
				[
					30.606952681806774,
					41.97517254778336
				],
				[
					51.59453895569834,
					36.72831983073934
				],
				[
					79.57803604469717,
					27.9834678547129
				],
				[
					101.44013675047745,
					24.485527064302232
				],
				[
					111.05944468982057,
					20.987586273891566
				],
				[
					112.8084150850259,
					20.113130310575116
				],
				[
					109.31047429461523,
					20.113130310575116
				],
				[
					100.5656223185888,
					20.987586273891566
				],
				[
					92.6952847744509,
					22.7365566690969
				],
				[
					70.83318406867068,
					28.85792381802935
				],
				[
					45.47317180676583,
					36.72831983073934
				],
				[
					36.72831983073928,
					38.47729022594467
				],
				[
					34.10486423793134,
					39.35174618926135
				],
				[
					33.23037904032867,
					39.35174618926135
				],
				[
					31.481437879409384,
					39.35174618926135
				],
				[
					31.481437879409384,
					41.97517254778336
				],
				[
					31.481437879409384,
					42.849686979672015
				],
				[
					33.23037904032867,
					45.4731133381938
				],
				[
					38.477290225944614,
					51.594538955698454
				],
				[
					46.34765700436844,
					58.59036206794758
				],
				[
					51.59453895569834,
					66.46075808065757
				],
				[
					57.71593533891689,
					77.82903641520602
				],
				[
					67.33527251254606,
					89.19731474975447
				],
				[
					81.32700643990245,
					107.56147466512402
				],
				[
					89.19734398404034,
					118.0552970363558
				],
				[
					97.06768152817818,
					126.80014901238224
				],
				[
					104.06356310899935,
					135.54494251983692
				],
				[
					111.93395912170922,
					143.41533853254668
				],
				[
					116.30635587543645,
					147.78773528627403
				],
				[
					120.67875262916368,
					153.90910243520648
				],
				[
					122.42772302436902,
					155.6580728304118
				],
				[
					123.30223745625767,
					158.28155765750557
				],
				[
					125.051207851463,
					159.15601362082248
				],
				[
					125.051207851463,
					163.52846884312157
				],
				[
					125.92566381477968,
					167.02640963353224
				],
				[
					125.92566381477968,
					173.1477767824647
				],
				[
					125.92566381477968,
					182.76708472180803
				],
				[
					125.92566381477968,
					195.00987748824514
				],
				[
					125.92566381477968,
					208.1271262179987
				],
				[
					125.92566381477968,
					219.49540455254714
				],
				[
					125.92566381477968,
					226.49128613336848
				],
				[
					125.92566381477968,
					230.8636828870956
				],
				[
					125.92566381477968,
					236.98510850460025
				],
				[
					125.92566381477968,
					238.73407889980558
				],
				[
					125.92566381477968,
					239.60853486312226
				],
				[
					125.051207851463,
					239.60853486312226
				],
				[
					122.42772302436902,
					236.1105940727116
				],
				[
					118.92978223395846,
					223.86785977484647
				],
				[
					118.92978223395846,
					216.87197819402536
				],
				[
					118.05532627064179,
					206.3781558227936
				],
				[
					118.05532627064179,
					198.5078182786558
				],
				[
					117.18081183875313,
					193.26090709303958
				],
				[
					116.30635587543645,
					189.76296630262914
				],
				[
					116.30635587543645,
					188.88851033931246
				],
				[
					116.30635587543645,
					188.0139959074238
				],
				[
					115.43189991211989,
					186.26502551221847
				],
				[
					115.43189991211989,
					184.51605511701314
				],
				[
					115.43189991211989,
					182.76708472180803
				],
				[
					115.43189991211989,
					181.01811432660247
				],
				[
					116.30635587543645,
					178.3946879680807
				],
				[
					118.05532627064179,
					177.52017353619203
				],
				[
					121.55326706105245,
					175.7712031409867
				],
				[
					132.9215453956009,
					174.89674717767002
				],
				[
					142.54085333494402,
					174.02223274578137
				],
				[
					158.28158689179168,
					170.52435042394268
				],
				[
					163.52849807740768,
					169.64983599205402
				],
				[
					164.40295404072424,
					169.64983599205402
				],
				[
					165.2774684726129,
					169.64983599205402
				],
				[
					170.52437965822878,
					169.64983599205402
				],
				[
					175.7712323752727,
					167.90086559684892
				],
				[
					181.89265799277723,
					167.02640963353224
				],
				[
					185.3905987831879,
					165.2774392383269
				],
				[
					185.3905987831879,
					165.2774392383269
				]
			],
			"pressures": [],
			"simulatePressure": true,
			"lastCommittedPoint": [
				185.3905987831879,
				165.2774392383269
			]
		},
		{
			"id": "Z8fBuO8g9cZ3M0UFtFLQP",
			"type": "freedraw",
			"x": 101.6791451309063,
			"y": 1204.5338933520902,
			"width": 31.481408645123395,
			"height": 1.7489703952051059,
			"angle": 0,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 20,
			"groupIds": [],
			"roundness": null,
			"seed": 1650538180,
			"version": 17,
			"versionNonce": 635602756,
			"isDeleted": true,
			"boundElements": null,
			"updated": 1683741846517,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					0.8744851976026098,
					0
				],
				[
					4.3724259880132195,
					0
				],
				[
					8.74482274174045,
					1.7489703952051059
				],
				[
					13.991733927356393,
					1.7489703952051059
				],
				[
					19.23864511297228,
					1.7489703952051059
				],
				[
					20.113130310574945,
					1.7489703952051059
				],
				[
					21.86210070578022,
					1.7489703952051059
				],
				[
					22.73658590338289,
					1.7489703952051059
				],
				[
					26.23449745950751,
					1.7489703952051059
				],
				[
					28.85795305231545,
					1.7489703952051059
				],
				[
					30.606923447520728,
					1.7489703952051059
				],
				[
					31.481408645123395,
					1.7489703952051059
				],
				[
					31.481408645123395,
					1.7489703952051059
				]
			],
			"pressures": [],
			"simulatePressure": true,
			"lastCommittedPoint": [
				31.481408645123395,
				1.7489703952051059
			]
		},
		{
			"id": "JgJVC94002ZcHb00X5PwA",
			"type": "freedraw",
			"x": 152.39919888900204,
			"y": 1191.4166446223364,
			"width": 7.870366778423829,
			"height": 28.857923818029576,
			"angle": 0,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 20,
			"groupIds": [],
			"roundness": null,
			"seed": 2020346620,
			"version": 21,
			"versionNonce": 81755900,
			"isDeleted": true,
			"boundElements": null,
			"updated": 1683741846517,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					0,
					-0.8744559633166773
				],
				[
					0,
					-3.4979407904106665
				],
				[
					1.7489703952052764,
					-6.121367148932677
				],
				[
					2.623455592807943,
					-9.619307939343116
				],
				[
					2.623455592807943,
					-14.866219124959116
				],
				[
					3.497940790410553,
					-16.61518952016445
				],
				[
					4.3724259880132195,
					-18.364159915369783
				],
				[
					4.3724259880132195,
					-19.23861587868646
				],
				[
					4.3724259880132195,
					-20.113130310575116
				],
				[
					4.3724259880132195,
					-20.987586273891566
				],
				[
					5.246911185615886,
					-22.7365566690969
				],
				[
					5.246911185615886,
					-23.611071100985555
				],
				[
					6.121396383218553,
					-23.611071100985555
				],
				[
					6.9958815808211625,
					-26.234497459507566
				],
				[
					7.870366778423829,
					-27.10901189139622
				],
				[
					7.870366778423829,
					-28.857923818029576
				],
				[
					7.870366778423829,
					-28.857923818029576
				]
			],
			"pressures": [],
			"simulatePressure": true,
			"lastCommittedPoint": [
				7.870366778423829,
				-28.857923818029576
			]
		},
		{
			"id": "4J9rLzW-nYL72frUahXsU",
			"type": "freedraw",
			"x": 126.16467219520848,
			"y": 1142.445590493732,
			"width": 270.215502162072,
			"height": 244.85547528302413,
			"angle": 0,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 20,
			"groupIds": [],
			"roundness": null,
			"seed": 296662596,
			"version": 91,
			"versionNonce": 1511587524,
			"isDeleted": true,
			"boundElements": null,
			"updated": 1683741846517,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					-2.6234263585219537,
					-1.7489703952053333
				],
				[
					-8.744822741740506,
					-1.7489703952053333
				],
				[
					-14.86621912495906,
					-1.7489703952053333
				],
				[
					-24.485527064302175,
					-1.7489703952053333
				],
				[
					-35.85383463313667,
					-0.874514431888656
				],
				[
					-49.845568560493064,
					2.6234263585220106
				],
				[
					-62.08833209264418,
					6.12136714893245
				],
				[
					-71.70766926627334,
					8.74479350745446
				],
				[
					-81.32697720561649,
					13.99170469307046
				],
				[
					-92.69527015730793,
					20.987586273891566
				],
				[
					-108.43597447986963,
					33.23037904032867
				],
				[
					-116.30634125829351,
					41.100716584466454
				],
				[
					-120.67875262916374,
					45.4731133381938
				],
				[
					-122.42772302436904,
					51.594538955698454
				],
				[
					-124.17669341957435,
					58.59036206794758
				],
				[
					-125.05117861717702,
					66.46075808065757
				],
				[
					-125.92566381477965,
					73.45663966147868
				],
				[
					-127.67461959284196,
					85.6993739593438
				],
				[
					-127.67461959284196,
					98.81662268909736
				],
				[
					-127.67461959284196,
					111.93392988742312
				],
				[
					-125.05117861717702,
					120.6787233948778
				],
				[
					-119.8042674315611,
					132.9215161613149
				],
				[
					-115.43185606069085,
					142.54082410065803
				],
				[
					-107.56150389940998,
					155.6580728304118
				],
				[
					-101.44010751619143,
					163.5284688431218
				],
				[
					-91.82078495970529,
					174.89674717767025
				],
				[
					-81.32697720561649,
					183.6415991536967
				],
				[
					-68.20972847586273,
					192.38639266115092
				],
				[
					-56.84142090702824,
					200.2567886738609
				],
				[
					-45.47314257247979,
					205.5036998594769
				],
				[
					-33.23037904032873,
					209.0015821813156
				],
				[
					-19.23861587868629,
					210.7505525765207
				],
				[
					-2.6234263585219537,
					213.3740374036147
				],
				[
					20.113130310574945,
					213.3740374036147
				],
				[
					29.732467484204108,
					213.3740374036147
				],
				[
					56.84145014131428,
					213.3740374036147
				],
				[
					72.582183698162,
					209.0015821813156
				],
				[
					86.57391762551839,
					203.75472946427158
				],
				[
					95.3187403672589,
					197.63330384676715
				],
				[
					104.06359234328545,
					189.76296630262914
				],
				[
					108.43601833129867,
					181.89262875849113
				],
				[
					115.4318706778339,
					171.39880638725958
				],
				[
					121.55326706105245,
					160.03052805271113
				],
				[
					128.54914864187361,
					143.41533853254668
				],
				[
					135.54500098840884,
					126.80014901238224
				],
				[
					139.91742697642206,
					98.81662268909736
				],
				[
					142.54088256923006,
					86.57388839123246
				],
				[
					142.54088256923006,
					61.21384689504157
				],
				[
					138.1684565812168,
					42.84968697967179
				],
				[
					132.9215453956009,
					27.108953422824243
				],
				[
					126.80017824666834,
					14.866219124959116
				],
				[
					118.92981146824445,
					5.246852717043794
				],
				[
					113.68290028262857,
					-2.6234848270939892
				],
				[
					108.43601833129867,
					-9.619366407915322
				],
				[
					104.93807754088806,
					-13.117277964039886
				],
				[
					102.31462194808012,
					-14.866248359244992
				],
				[
					96.19322556486156,
					-18.364189149655658
				],
				[
					94.44425516965623,
					-19.23867434725821
				],
				[
					90.071858415929,
					-20.98764474246377
				],
				[
					86.57391762551839,
					-21.862129940066325
				],
				[
					84.82494723031311,
					-22.736615137668878
				],
				[
					83.07597683510778,
					-23.611100335271658
				],
				[
					77.8290656494919,
					-26.234555928079544
				],
				[
					73.45666889576466,
					-27.983497088998774
				],
				[
					69.95872810535406,
					-28.857982286601555
				],
				[
					65.58630211734078,
					-28.857982286601555
				],
				[
					61.21387612932756,
					-31.48143787940944
				],
				[
					60.33939093172489,
					-31.48143787940944
				],
				[
					55.966964943711616,
					-31.48143787940944
				],
				[
					49.84559779477911,
					-31.48143787940944
				],
				[
					44.59868660916317,
					-31.48143787940944
				],
				[
					40.22626062114995,
					-31.48143787940944
				],
				[
					35.85386386742272,
					-31.48143787940944
				],
				[
					32.35592307701211,
					-31.48143787940944
				],
				[
					27.109011891396165,
					-27.983497088998774
				],
				[
					23.611071100985555,
					-27.983497088998774
				],
				[
					17.48970395205305,
					-24.48558553287421
				],
				[
					14.866248359245105,
					-22.736615137668878
				],
				[
					11.368307568834496,
					-18.364189149655658
				],
				[
					6.121396383218553,
					-15.740733556847772
				],
				[
					1.7489703952053333,
					-10.493822371231772
				],
				[
					-0.8744559633166205,
					-5.246911185616
				],
				[
					-4.37239675372723,
					0
				],
				[
					-6.995852346535173,
					4.372396753727344
				],
				[
					-8.744822741740506,
					8.74479350745446
				],
				[
					-8.744822741740506,
					9.619307939343116
				],
				[
					-8.744822741740506,
					9.619307939343116
				]
			],
			"pressures": [],
			"simulatePressure": true,
			"lastCommittedPoint": [
				-8.744822741740506,
				9.619307939343116
			]
		},
		{
			"id": "UbOpc8SURUytB5BKXE8Ca",
			"type": "freedraw",
			"x": 339.53876806739527,
			"y": 1221.1490828722544,
			"width": 104.93807754088812,
			"height": 91.82077034256235,
			"angle": 0,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 20,
			"groupIds": [],
			"roundness": null,
			"seed": 367146492,
			"version": 56,
			"versionNonce": 789462908,
			"isDeleted": true,
			"boundElements": null,
			"updated": 1683741846518,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					-0.874514431888656,
					-1.7489703952051059
				],
				[
					-5.246911185616,
					-8.74479350745446
				],
				[
					-15.740733556847772,
					-24.485527064302005
				],
				[
					-21.862100705780335,
					-36.72831983073934
				],
				[
					-32.35592307701211,
					-50.72002452380957
				],
				[
					-40.22626062114995,
					-60.339332463152914
				],
				[
					-45.47317180676589,
					-68.20972847586268
				],
				[
					-49.845627029065156,
					-76.08006602000046
				],
				[
					-51.59456818998444,
					-82.20143316893314
				],
				[
					-51.59456818998444,
					-85.69937395934357
				],
				[
					-51.59456818998444,
					-88.32285878643779
				],
				[
					-51.59456818998444,
					-89.19731474975424
				],
				[
					-51.59456818998444,
					-90.0718291816429
				],
				[
					-50.720082992381776,
					-90.94628514495957
				],
				[
					-45.47317180676589,
					-90.94628514495957
				],
				[
					-39.35180465783333,
					-89.19731474975424
				],
				[
					-29.73249671849021,
					-85.69937395934357
				],
				[
					-22.73661513766899,
					-81.32697720561646
				],
				[
					-15.740733556847772,
					-76.95458045188934
				],
				[
					-8.744851976026553,
					-70.83315483438469
				],
				[
					-5.246911185616,
					-69.08418443917935
				],
				[
					-3.4979407904106665,
					-64.71178768545201
				],
				[
					-1.7489703952053333,
					-59.46487649983624
				],
				[
					0,
					-53.34350935090356
				],
				[
					1.748911926633241,
					-47.22208373339913
				],
				[
					1.748911926633241,
					-41.100716584466454
				],
				[
					1.748911926633241,
					-40.2262021525778
				],
				[
					2.623426358521897,
					-40.2262021525778
				],
				[
					3.497882321838574,
					-41.97517254778313
				],
				[
					6.12136714893245,
					-52.468994919014904
				],
				[
					8.74479350745446,
					-61.21384689504157
				],
				[
					14.866219124959002,
					-71.70766926627334
				],
				[
					21.862042237208243,
					-78.70349237852247
				],
				[
					28.85792381802935,
					-85.69937395934357
				],
				[
					36.728319830739224,
					-88.32285878643779
				],
				[
					40.2262021525778,
					-90.0718291816429
				],
				[
					46.347627770082454,
					-91.82077034256235
				],
				[
					48.09659816528767,
					-91.82077034256235
				],
				[
					49.84556856049301,
					-91.82077034256235
				],
				[
					51.59453895569834,
					-89.19731474975424
				],
				[
					52.46899491901502,
					-83.95040356413847
				],
				[
					53.34350935090367,
					-77.82903641520579
				],
				[
					53.34350935090367,
					-70.83315483438469
				],
				[
					45.4731133381938,
					-53.34350935090356
				],
				[
					34.10483500364535,
					-40.2262021525778
				],
				[
					16.615189520164336,
					-28.85792381802935
				],
				[
					2.623426358521897,
					-19.238615878686232
				],
				[
					-6.995881580821219,
					-13.99170469307046
				],
				[
					-13.117307198325875,
					-7.870337544137783
				],
				[
					-15.740733556847772,
					-6.995823112249127
				],
				[
					-15.740733556847772,
					-6.12136714893245
				],
				[
					-15.740733556847772,
					-6.12136714893245
				]
			],
			"pressures": [],
			"simulatePressure": true,
			"lastCommittedPoint": [
				-15.740733556847772,
				-6.12136714893245
			]
		},
		{
			"id": "tCnsdlczB5XxchtwxEPMk",
			"type": "freedraw",
			"x": 386.7608518007943,
			"y": 1225.5215380945538,
			"width": 24.48558553287421,
			"height": 56.841450141314226,
			"angle": 0,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 20,
			"groupIds": [],
			"roundness": null,
			"seed": 1035137916,
			"version": 20,
			"versionNonce": 1066698308,
			"isDeleted": true,
			"boundElements": null,
			"updated": 1683741846518,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					0.874514431888656,
					0
				],
				[
					0.874514431888656,
					2.6234263585220106
				],
				[
					3.4979407904106665,
					13.117248729753783
				],
				[
					4.3724552222993225,
					18.364159915369783
				],
				[
					4.3724552222993225,
					24.485527064302232
				],
				[
					3.4979407904106665,
					30.606952681806888
				],
				[
					1.7489703952053333,
					35.85380539885068
				],
				[
					0,
					40.22626062114978
				],
				[
					-1.7489703952052196,
					42.84968697967179
				],
				[
					-4.37239675372723,
					46.347627770082454
				],
				[
					-6.995881580821219,
					48.97111259717644
				],
				[
					-12.242734297865013,
					52.46899491901513
				],
				[
					-13.991704693070346,
					54.21796531422024
				],
				[
					-18.36415991536967,
					55.96693570942557
				],
				[
					-20.11313031057489,
					56.841450141314226
				],
				[
					-20.11313031057489,
					56.841450141314226
				]
			],
			"pressures": [],
			"simulatePressure": true,
			"lastCommittedPoint": [
				-20.11313031057489,
				56.841450141314226
			]
		},
		{
			"id": "PVPm5Lppc6lQyjaBgcODT",
			"type": "ellipse",
			"x": 490.82438567550753,
			"y": 1145.0690460865392,
			"width": 84.82491799602712,
			"height": 233.48713847990376,
			"angle": 0,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"seed": 378597372,
			"version": 112,
			"versionNonce": 1572392572,
			"isDeleted": true,
			"boundElements": null,
			"updated": 1683741858010,
			"link": null,
			"locked": false
		},
		{
			"id": "jHlStd0M",
			"type": "text",
			"x": 546.3080201685135,
			"y": 1217.177195836949,
			"width": 7.779296875,
			"height": 32.199999999999996,
			"angle": 0,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 1422261500,
			"version": 2,
			"versionNonce": 1080123588,
			"isDeleted": true,
			"boundElements": null,
			"updated": 1683741855847,
			"link": null,
			"locked": false,
			"text": "",
			"rawText": "",
			"fontSize": 28,
			"fontFamily": 2,
			"textAlign": "left",
			"verticalAlign": "top",
			"baseline": 26,
			"containerId": null,
			"originalText": "",
			"lineHeight": 1.15
		},
		{
			"id": "zMgwlGvQ",
			"type": "text",
			"x": -283.1570168977763,
			"y": 1245.3091318856607,
			"width": 7.779296875,
			"height": 32.199999999999996,
			"angle": 0,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 1326554876,
			"version": 8,
			"versionNonce": 1159636292,
			"isDeleted": true,
			"boundElements": null,
			"updated": 1683742089868,
			"link": null,
			"locked": false,
			"text": "",
			"rawText": "",
			"fontSize": 28,
			"fontFamily": 2,
			"textAlign": "left",
			"verticalAlign": "top",
			"baseline": 26,
			"containerId": null,
			"originalText": "",
			"lineHeight": 1.15
		}
	],
	"appState": {
		"theme": "dark",
		"viewBackgroundColor": "#ffffff",
		"currentItemStrokeColor": "#000000",
		"currentItemBackgroundColor": "transparent",
		"currentItemFillStyle": "hachure",
		"currentItemStrokeWidth": 2,
		"currentItemStrokeStyle": "solid",
		"currentItemRoughness": 1,
		"currentItemOpacity": 100,
		"currentItemFontFamily": 1,
		"currentItemFontSize": 16,
		"currentItemTextAlign": "left",
		"currentItemStartArrowhead": null,
		"currentItemEndArrowhead": "arrow",
		"scrollX": 910.7829442552224,
		"scrollY": -897.4672914141207,
		"zoom": {
			"value": 1.0500000000000007
		},
		"currentItemRoundness": "round",
		"gridSize": null,
		"colorPalette": {},
		"currentStrokeOptions": null,
		"previousGridSize": null
	},
	"files": {}
}
```
%%